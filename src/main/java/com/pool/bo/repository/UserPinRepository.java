package com.pool.bo.repository;

import com.pool.bo.model.UserPin;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;

@Repository
public interface UserPinRepository extends R2dbcRepository<UserPin, Long> {

  Mono<UserPin> findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(Long userId, Timestamp now);
}
