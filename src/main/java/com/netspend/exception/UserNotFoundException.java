package com.netspend.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String message;

	public UserNotFoundException(String message) {
		super(message);
	}

}
