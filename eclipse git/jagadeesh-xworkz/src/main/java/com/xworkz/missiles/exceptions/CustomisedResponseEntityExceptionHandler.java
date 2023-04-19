package com.xworkz.missiles.exceptions;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

//to userDefine exception
@ControllerAdvice  //to make exceptionHandling clear
public class CustomisedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
		
		ErrorDetails details=new ErrorDetails(LocalDate.now(),ex.getMessage(),request.getDescription(false));
		
		return new ResponseEntity(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
