package com.pool.bo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Data
public class Provider {

  @Id
  private Long id;
  private String name;
  private Integer timezone;
  private Integer status;
}
