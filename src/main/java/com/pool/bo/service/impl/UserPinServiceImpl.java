package com.pool.bo.service.impl;

import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserPinRequest;
import com.pool.bo.model.UserPin;
import com.pool.bo.repository.UserPinRepository;
import com.pool.bo.service.BaseService;
import com.pool.bo.service.UserPinService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class UserPinServiceImpl extends BaseService implements UserPinService {

  private final UserPinRepository userPinRepository;

  @Override
  public Flux<KafkaMessage> findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(KafkaMessage finalMessage, UserPinRequest request) {
    return isValidRequest(request)
      .flatMap(timestamp -> Flux.from(getSource(finalMessage, request, timestamp)))
      .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.INVALID_JSON_FORMAT, "Invalid json format"));
  }

  private Mono<KafkaMessage> getSource(KafkaMessage finalMessage, UserPinRequest request, Timestamp timestamp) {
    return Mono
      .defer(
        () -> getUserPinMono(request, timestamp)
      )
      .subscribeOn(Schedulers.boundedElastic())
      .map(
        userPin -> new KafkaMessage(
          finalMessage.getClientCode(),
          finalMessage.getMethod(),
          finalMessage.getMessageId(),
          DSSCode.SUCCESS,
          userPin)
      )
      .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.MISSING_USER_PIN, "User pin not found"));
  }

  private Mono<UserPin> getUserPinMono(UserPinRequest request, Timestamp timestamp) {
    return userPinRepository
      .findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(request.getUserId(), timestamp)
      .map(Mono::just)
      .blockOptional()
      .orElseGet(Mono::empty);
  }
}
