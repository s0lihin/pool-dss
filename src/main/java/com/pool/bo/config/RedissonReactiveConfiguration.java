package com.pool.bo.config;

import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.codec.JsonJacksonCodec;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;
import org.redisson.spring.data.connection.RedissonConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class RedissonReactiveConfiguration {

  @Bean
  public Config masterSlaveConfig() {
    Config config = new Config();

    config.useSingleServer()
      .setAddress("redis://10.22.120.219:6379")
      .setPassword("tgljaya")
      .setClientName("pool-api-bo-redis")
      .setDatabase(4)
      .setDnsMonitoringInterval(5000)
      .setSubscriptionConnectionMinimumIdleSize(1)
      .setSubscriptionConnectionPoolSize(100)
      .setConnectionMinimumIdleSize(1)
      .setConnectionPoolSize(64)
      .setIdleConnectionTimeout(60000)
      .setConnectTimeout(60000)
      .setTimeout(60000)
      .setRetryAttempts(150)
      .setRetryInterval(100)
      .setSubscriptionsPerConnection(25)
      .setPingConnectionInterval(60000)
      .setKeepAlive(false)
      .setTcpNoDelay(false);

    config.setLockWatchdogTimeout(10000);
    config.setThreads(128).setNettyThreads(256).setCodec(new JsonJacksonCodec()).setTransportMode(TransportMode.NIO);

    return config;
  }

  @Bean
  public RedissonClient redissonClient(Config config) {
    return Redisson.create(config);
  }

  @Bean
  public RedissonConnectionFactory redissonConnectionFactory(RedissonClient redissonClient) {
    return new RedissonConnectionFactory(redissonClient);
  }
}
