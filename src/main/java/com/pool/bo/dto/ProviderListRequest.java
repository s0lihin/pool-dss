package com.pool.bo.dto;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProviderListRequest extends RequestBaseDto implements DomainObject {
	private String name;
	private String token;
	@Id
    private Long id;
}