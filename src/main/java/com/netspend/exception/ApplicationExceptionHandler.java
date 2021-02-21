package com.netspend.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(value = UserValidationException.class)
	public ResponseEntity<Object> UserServiceValidationException(UserValidationException exception,
			WebRequest webRequest) {

		return new ResponseEntity<Object>(new ErrorMessageResponse(new Date(), exception.getMessage()),
				new HttpHeaders(), HttpStatus.BAD_REQUEST);

	}

}
