package com.napptilus.rest.errorhandling;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ErrorExceptionHandler {
	
	/**
	 * This function handles the errors caused in the requests of the api
	 * @param ex  the runtime exception
	 * @return Response with error information
	 */
	
	@ExceptionHandler(value =  {RequestException.class})
	public ResponseEntity<Object> handleRequestException(RequestException ex) {
		
		ApiException apiException=new ApiException(
				ex.getMessage(),
				null, 
				HttpStatus.BAD_REQUEST, 
				ZonedDateTime.now(ZoneId.of("Z")));
		
		return new ResponseEntity<>(apiException,HttpStatus.BAD_REQUEST);
	}

}
