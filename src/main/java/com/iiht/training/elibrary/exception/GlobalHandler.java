package com.iiht.training.elibrary.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.iiht.training.elibrary.model.exception.ExceptionResponse;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(InvalidBookDetailsException.class)
	public ResponseEntity<ExceptionResponse> handler(InvalidBookDetailsException ex) {
		ExceptionResponse exception = new ExceptionResponse(ex.getMessage(), System.currentTimeMillis(),
				HttpStatus.BAD_REQUEST.value());
		ResponseEntity<ExceptionResponse> response = new ResponseEntity<ExceptionResponse>(exception,
				HttpStatus.BAD_REQUEST);
		return response;
	}

}
