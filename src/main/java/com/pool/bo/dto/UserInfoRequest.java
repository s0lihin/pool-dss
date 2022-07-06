package com.pool.bo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserInfoRequest extends RequestBaseDto implements DomainObject {

  private String username;
  private String token;
  private Integer verifyLogin;
  private Integer verifyPin;
}
