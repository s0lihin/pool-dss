package com.pool.bo.service.impl;

import com.pool.bo.config.DSSCode;
import com.pool.bo.dto.KafkaMessage;
import com.pool.bo.dto.ProviderListRequest;
import com.pool.bo.dto.UserInfoRequest;
import com.pool.bo.dto.UserStatusRequest;
import com.pool.bo.model.UserStatus;
import com.pool.bo.repository.ProviderRepository;
import com.pool.bo.repository.UserStatusRepository;
import com.pool.bo.service.BaseService;
import com.pool.bo.service.ProviderService;
import com.pool.bo.service.UserStatusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@Service
@RequiredArgsConstructor
public class ProviderServiceImpl extends BaseService implements ProviderService {

  private final ProviderRepository repository;

	
	public Flux<KafkaMessage> findAll(KafkaMessage finalMessage, ProviderListRequest request) {
		return Flux.from(repository.findAll().map(s -> new KafkaMessage(finalMessage.getClientCode(),finalMessage.getMethod(), finalMessage.getMessageId(), 0,s)));
	  }

	@Override
	public Flux<KafkaMessage> findByNickname(KafkaMessage finalMessage, ProviderListRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
