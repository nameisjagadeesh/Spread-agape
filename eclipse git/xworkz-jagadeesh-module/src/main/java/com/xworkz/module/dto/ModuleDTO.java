package com.xworkz.module.dto;

import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCreation;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ModuleDTO {
	private int id;
	@Size(min = 3, max = 25, message = "userId is not within range of 3 and 25")
	private String userId;
	@NotNull(message = "number should not be empty")
	private Long number;
	@Size(min = 7, max = 40, message = "email is not within range of 7 and 40")
	private String email;
	@Size(min = 8, max = 25, message = "password is not within range of 8 and 15")
	private String password;
	@NotNull
	@NotBlank
	private String confirmPassword;	
	@NotNull
	private Boolean agreement;
	
	private int signInCount;
	private Boolean passwordReset; 

}
