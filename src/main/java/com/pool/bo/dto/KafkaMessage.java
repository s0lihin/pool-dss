package com.pool.bo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KafkaMessage implements DomainObject {

  private String clientCode;
  private String method;
  private String messageId;
  private int ec;
  private Object data;
}
