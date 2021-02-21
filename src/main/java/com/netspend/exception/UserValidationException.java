package com.netspend.exception;

public class UserValidationException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	String message;
	
	
	UserValidationException(String message){
		super(message);
	}

}
