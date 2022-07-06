package com.pool.bo.service;

import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.ProviderListRequest;
import com.pool.bo.dto.UserInfoRequest;
import reactor.core.publisher.Flux;

public interface ProviderService 
{
  Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, ProviderListRequest request);
  Flux<KafkaMessage> findAll(KafkaMessage finalMessage, ProviderListRequest request);
}