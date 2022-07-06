package com.pool.bo.repository;

import com.pool.bo.model.UserStatus;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.sql.Timestamp;

@Repository
public interface UserStatusRepository extends R2dbcRepository<UserStatus, Long> {

  Mono<UserStatus> findFirstByUserIdAndDatetimeLessThanEqualOrderByDatetimeDesc(Long userId, Timestamp now);
}
