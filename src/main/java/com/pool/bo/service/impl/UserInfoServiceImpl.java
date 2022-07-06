package com.pool.bo.service.impl;

import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserInfoRequest;
import com.pool.bo.model.UserInfo;
import com.pool.bo.repository.UserInfoRepository;
import com.pool.bo.service.BaseService;
import com.pool.bo.service.UserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
public class UserInfoServiceImpl extends BaseService implements UserInfoService {

  private final UserInfoRepository userInfoRepository;

  @Override
  public Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, UserInfoRequest request) {
    return Flux.from(
      Mono.defer(
        () -> getUserInfoMono(request)
      ).subscribeOn(Schedulers.boundedElastic())
        .map(userInfo -> new KafkaMessage(finalMessage.getClientCode(), finalMessage.getMethod(), finalMessage.getMessageId(), DSSCode.SUCCESS, userInfo))
        .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.USER_NOT_FOUND, "User not found"))
    );
  }

  private Mono<UserInfo> getUserInfoMono(UserInfoRequest request) {
    return userInfoRepository
      .findByNickname(request.getUsername().toLowerCase())
      .map(Mono::just)
      .blockOptional()
      .orElseGet(Mono::empty);
  }
}
