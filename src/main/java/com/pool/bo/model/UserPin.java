package com.pool.bo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Data
public class UserPin {

  @Id
  private Long id;
  private Long userId;
  private String pin;
  private Timestamp datetime;
  private String ip;
  private Integer status;
}
