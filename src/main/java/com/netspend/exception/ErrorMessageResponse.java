package com.netspend.exception;

import java.util.Date;

public class ErrorMessageResponse {

	private Date timestamp;
	private String errorMessages;

	public ErrorMessageResponse(Date timestamp, String errorMessages) {
		super();
		this.timestamp = timestamp;
		this.errorMessages = errorMessages;
	}

}
