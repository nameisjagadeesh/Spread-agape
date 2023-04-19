package com.xworkz.missiles.exceptions;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class ErrorDetails {

	
	private LocalDate timeStamp;
	private String message;
	private String details;
	
}
