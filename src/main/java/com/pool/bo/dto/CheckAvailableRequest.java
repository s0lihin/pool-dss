package com.pool.bo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckAvailableRequest implements DomainObject {

  private String token;
  private String username;
  private Long userId;
  private String un;
  private String usnn;
}
