package com.pool.bo.service.impl;

import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.AuthenticationRequest;
import com.pool.bo.dto.CheckAvailableRequest;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.model.UserInfo;
import com.pool.bo.repository.UserInfoRepository;
import com.pool.bo.service.BaseService;
import com.pool.bo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends BaseService implements UserService {

  private final UserInfoRepository userInfoRepository;

  public Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, AuthenticationRequest request) {
    return Flux.from(
      Mono.defer(
        () -> getUserInfoMono(request)
      ).subscribeOn(Schedulers.boundedElastic())
        .map(userInfo -> new KafkaMessage(finalMessage.getClientCode(), finalMessage.getMethod(), finalMessage.getMessageId(), DSSCode.SUCCESS, userInfo))
        .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.USER_NOT_FOUND, "Incorrect username or password!"))
    );
  }

  public Flux<KafkaMessage> findFirstByIdOrUsernameOrNickname(KafkaMessage finalMessage, CheckAvailableRequest request) {
    return Flux.from(
      Mono.defer(
        () -> getChekAvailable(request)
      ).subscribeOn(Schedulers.boundedElastic())
      .map(userInfo -> new KafkaMessage(finalMessage.getClientCode(), finalMessage.getMethod(), finalMessage.getMessageId(), DSSCode.SUCCESS, userInfo))
      .switchIfEmpty(onFailurehandler(finalMessage, DSSCode.USER_NOT_FOUND, "User has not registered"))
    );
  }

  private Mono<UserInfo> getUserInfoMono(AuthenticationRequest request) {
    return userInfoRepository
      .findByNickname(request.getUsername().toLowerCase())
      .map(Mono::just)
      .blockOptional()
      .orElseGet(Mono::empty);
  }

  private Mono<UserInfo> getChekAvailable(CheckAvailableRequest request) {
    return userInfoRepository
      .findFirstByIdOrUsernameOrNickname(request.getUserId(), request.getUn().toLowerCase(), request.getUsnn())
      .map(Mono:: just)
      .blockOptional()
      .orElseGet(Mono::empty);
  }
}
