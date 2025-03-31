package com.spring.rest_api_assignment.springboot_rest_api_assignment.exception;

public class InvalidIdException extends Exception{

	private static final long serialVersionUID = 1L;

	private String message;
	
	
	public InvalidIdException(String message) {
		super();
		this.message = message;
	}


	@Override
	public String getMessage() {
		return message;
	}
}
