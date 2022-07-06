package com.pool.bo.service;

import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.UserStatusRequest;
import reactor.core.publisher.Flux;

public interface UserStatusService {

  Flux<KafkaMessage> findFirstByUserIdAndAndDatetimeLessThanEqualOrderByDatetimeDesc(KafkaMessage kafkaMessage, UserStatusRequest request);
}
