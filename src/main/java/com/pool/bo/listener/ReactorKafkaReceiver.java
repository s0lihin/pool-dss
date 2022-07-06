package com.pool.bo.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.*;
import com.pool.bo.service.ProviderService;
import com.pool.bo.service.impl.UserInfoServiceImpl;
import com.pool.bo.service.impl.UserPinServiceImpl;
import com.pool.bo.service.impl.UserServiceImpl;
import com.pool.bo.service.impl.UserStatusServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderRecord;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class ReactorKafkaReceiver {

  private final KafkaReceiver<Long, String> kafkaReceiver;
  private final KafkaSender<Long, String> kafkaSender;
  private final UserServiceImpl userService;
  private final UserStatusServiceImpl userStatusService;
  private final UserPinServiceImpl userPinService;
  private final UserInfoServiceImpl userInfoService;
  private final ProviderService providerService;

  @Value("${spring.kafka.client-code}")
  protected String clientCode;

  @Autowired
  public void processor() {
    kafkaReceiver
      .receive()
      .filter(record -> {
        KafkaMessage message = new KafkaMessage();

        try {
          message = new ObjectMapper().readValue(record.value(), KafkaMessage.class);
        } catch (JsonProcessingException ex) {
          ex.printStackTrace();
        }

        return clientCode.equals(message.getClientCode());
      })
      .subscribe(record -> {
        log.info("Received Data : {}", record.value());

        KafkaMessage message = new KafkaMessage();

        try {
          message = new ObjectMapper().readValue(record.value(), KafkaMessage.class);
        } catch (JsonProcessingException e) {
          e.printStackTrace();
        }

        final KafkaMessage finalMessage = message;

        record.receiverOffset().acknowledge();

        Flux<KafkaMessage> messageValue;

        switch (finalMessage.getMethod()) {
          case "Login": {
            AuthenticationRequest request = new ObjectMapper().convertValue(finalMessage.getData(), AuthenticationRequest.class);
            messageValue = userService.findByNickname(finalMessage, request);
            break;
          }
          case "UserStatus": {
            UserStatusRequest request = new ObjectMapper().convertValue(finalMessage.getData(), UserStatusRequest.class);
            messageValue = userStatusService.findFirstByUserIdAndAndDatetimeLessThanEqualOrderByDatetimeDesc(finalMessage, request);
            break;
          }
          case "UserPin": {
            UserPinRequest request = new ObjectMapper().convertValue(finalMessage.getData(), UserPinRequest.class);
            messageValue = userPinService.findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(finalMessage, request);
            break;
          }
          case "Usinfo": {
            UserInfoRequest request = new ObjectMapper().convertValue(finalMessage.getData(), UserInfoRequest.class);
            messageValue = userInfoService.findByNickname(finalMessage, request);
            break;

          }
          case "CheckAvailable": {
            CheckAvailableRequest request = new ObjectMapper().convertValue(finalMessage.getData(), CheckAvailableRequest.class);
            messageValue = userService.findFirstByIdOrUsernameOrNickname(finalMessage, request);
            break;
          }
          case "Get All Provider": {
        	  ProviderListRequest request = new ObjectMapper().convertValue(finalMessage.getData(), ProviderListRequest.class);
        	  messageValue = providerService.findAll(finalMessage, request);
        	  break;
          }
          default: {
            log.info("No Such Method as : {}", finalMessage.getMethod());
            return;
          }
        }

        kafkaSender.send(createOutBoundFlux(messageValue))
          .doOnError(e -> log.error("Send failed", e))
          .doOnComplete(() -> {
        	  try {
        		  Thread.sleep(50);
        	  }
        	  catch ( Exception e )
        	  {
        		  
        	  }
        	  kafkaSender.send(createOutBoundFlux(endSignalMessage(finalMessage))).subscribe() ;
          } ).subscribe();
      });
  }

  public Flux<SenderRecord<Long, String, Long>> createOutBoundFlux(Flux<KafkaMessage> messageValue) {
    Long key = UUID.randomUUID().getLeastSignificantBits() & Long.MAX_VALUE;

    return messageValue
      .map(i -> {
        ProducerRecord<Long, String> producerRecord = new ProducerRecord<>("dss-api", key, new Gson().toJson(i));
        SenderRecord<Long, String, Long> record = SenderRecord.create(producerRecord, key);
        log.info("sent {}", record.value());
        return record;
      });
  }

  private Flux<KafkaMessage> endSignalMessage(KafkaMessage finalMessage) {
    return Flux.just(new KafkaMessage(finalMessage.getClientCode(), "End Signal", finalMessage.getMessageId(), DSSCode.SUCCESS, null));
  }
}
