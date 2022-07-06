package com.pool.bo.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.receiver.ReceiverOptions;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderOptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ReactorKafkaConfiguration {

  @Value("${spring.kafka.bootstrap-servers}")
  private String bootstrapServers;

  @Value("${spring.kafka.consumer.client-id}")
  private String consumerClientId;

  @Value("${spring.kafka.consumer.group-id}")
  private String groupId;

  @Value("${spring.kafka.consumer.auto-offset-reset}")
  private String autoOffsetReset;

  @Value("${spring.kafka.consumer.api-dss-topic}")
  private String apiDssTopic;

  @Value("${spring.kafka.producer.client-id}")
  private String producerClientId;

  @Value("${spring.kafka.producer.acks}")
  private String acks;

  @Bean
  public SenderOptions<Long, String> senderOptions() {
    Map<String, Object> producerProps = new HashMap<>();
    producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    producerProps.put(ProducerConfig.CLIENT_ID_CONFIG, producerClientId);
    producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, LongSerializer.class);
    producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    return SenderOptions.<Long, String>create(producerProps).maxInFlight(1024);
  }

  @Bean
  public KafkaSender<Long, String> kafkaSender() {
    return KafkaSender.create(senderOptions());
  }

  @Bean
  public ReceiverOptions<Long, String> receiverOptions() {
    Map<String, Object> consumerProps = new HashMap<>();
    consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
    consumerProps.put(ConsumerConfig.CLIENT_ID_CONFIG, consumerClientId);
    consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
    consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, LongDeserializer.class);
    consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
    consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoOffsetReset);
    return ReceiverOptions.<Long, String>create(consumerProps)
      .subscription(Collections.singleton(apiDssTopic));
  }

  @Bean
  KafkaReceiver<Long, String> kafkaReceiver() {
    return KafkaReceiver.create(receiverOptions());
  }
}
