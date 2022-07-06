package com.pool.bo.service.impl;

import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserStatusRequest;
import com.pool.bo.model.UserStatus;
import com.pool.bo.repository.UserStatusRepository;
import com.pool.bo.service.BaseService;
import com.pool.bo.service.UserStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.sql.Timestamp;

@Service
@RequiredArgsConstructor
public class UserStatusServiceImpl extends BaseService implements UserStatusService {

  private final UserStatusRepository userStatusRepository;

  @Override
  public Flux<KafkaMessage> findFirstByUserIdAndAndDatetimeLessThanEqualOrderByDatetimeDesc(KafkaMessage finalMessage, UserStatusRequest request) {
    return isValidRequest(request)
      .flatMap(timestamp -> Flux.from(getSource(finalMessage, request, timestamp)))
      .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.INVALID_JSON_FORMAT, "Invalid json format"));
  }

  private Mono<KafkaMessage> getSource(KafkaMessage finalMessage, UserStatusRequest request, Timestamp timestamp) {
    return Mono
      .defer(
        () -> getUserStatusMono(request, timestamp)
      )
      .subscribeOn(Schedulers.boundedElastic())
      .map(
        userStatus -> new KafkaMessage(
          finalMessage.getClientCode(),
          finalMessage.getMethod(),
          finalMessage.getMessageId(),
          DSSCode.SUCCESS,
          userStatus)
      )
      .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.MISSING_STATUS, "Status not found"));
  }

  private Mono<UserStatus> getUserStatusMono(UserStatusRequest request, Timestamp timestamp) {
    return userStatusRepository
      .findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(request.getUserId(), timestamp)
      .map(Mono::just)
      .blockOptional()
      .orElseGet(Mono::empty);
  }
}
