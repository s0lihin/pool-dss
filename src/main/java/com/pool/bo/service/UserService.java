package com.pool.bo.service;

import com.pool.bo.dto.AuthenticationRequest;
import com.pool.bo.dto.CheckAvailableRequest;
import com.pool.bo.dto.KafkaMessage;
import reactor.core.publisher.Flux;

public interface UserService {

  Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, AuthenticationRequest request);

  Flux<KafkaMessage> findFirstByIdOrUsernameOrNickname(KafkaMessage finalMessage, CheckAvailableRequest request);
}
