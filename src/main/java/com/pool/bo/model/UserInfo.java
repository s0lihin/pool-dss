package com.pool.bo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserInfo {

  @Id
  private Long id;
  private Long parent;
  private Integer resetPin;
  private Integer tryPassword;
  private Integer tryPin;
  private Long creditLimit;
  private Long creditBalance;
  private Integer setup;
  private Integer timezone;
  private Integer type;
  private Integer level;
  private String username;
  private String password;
  private Integer resetPassword;
  private String code;
  private String nickname;
  private String firstname;
  private String lastname;
  private String phone;
  private String handphone;
}
