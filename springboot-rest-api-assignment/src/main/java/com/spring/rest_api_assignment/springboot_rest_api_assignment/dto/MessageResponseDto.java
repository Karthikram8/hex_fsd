package com.spring.rest_api_assignment.springboot_rest_api_assignment.dto;

import org.springframework.stereotype.Component;

@Component
public class MessageResponseDto {

	private int status;
	private String body;
	
	
	public MessageResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MessageResponseDto(int status, String body) {
		super();
		this.status = status;
		this.body = body;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	
}
