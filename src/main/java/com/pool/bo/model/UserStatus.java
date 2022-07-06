package com.pool.bo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Data
public class UserStatus {

  @Id
  private Long id;
  private Long userId;
  private Integer status;
  private Timestamp datetime;
  private String ip;
}
