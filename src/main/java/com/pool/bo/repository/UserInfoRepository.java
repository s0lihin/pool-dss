package com.pool.bo.repository;

import com.pool.bo.model.UserInfo;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserInfoRepository extends R2dbcRepository<UserInfo, Long> {

  Mono<UserInfo> findByNickname(String nickname);

  Mono<UserInfo> findFirstByIdOrUsernameOrNickname(Long userId, String username, String nickname);
}
