package com.pool.bo.service;

import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserInfoRequest;
import reactor.core.publisher.Flux;

public interface UserInfoService {

  Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, UserInfoRequest request);
}
