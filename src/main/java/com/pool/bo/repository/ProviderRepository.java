package com.pool.bo.repository;

import com.pool.bo.model.Provider;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;

@Repository
public interface ProviderRepository extends R2dbcRepository<Provider, Long> {

  Mono<Provider> findById(Long id);
}
