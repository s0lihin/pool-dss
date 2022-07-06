package com.pool.bo.service;

import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserPinRequest;
import com.pool.bo.dto.UserStatusRequest;
import reactor.core.publisher.Flux;

public interface UserPinService {

  Flux<KafkaMessage> findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(KafkaMessage kafkaMessage, UserPinRequest request);
}
