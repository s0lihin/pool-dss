package com.pool.bo.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserPinRequest extends RequestBaseDto implements DomainObject {

  private Integer index;
  private Integer index2;
  private String pin1;
  private String pin2;
}
