package com.xworkz.crudSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//the main purpose of this example is to get the validation done without using the spring 
//using lombok which generates codes of all the getters,setters,tostring automatically during runtime
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class SoftwareDTO {
	@NonNull
	@NotNull
	@Size(min = 5, max = 21, message = "name is not withing range of 5 to 21")
	private String name;
	
	
	@Max(value = 1500, message = "size is not withing range of 600mb to 1500mb")
	@Min(value = 600, message = "size is not withing range of 600mb to 1500mb")
	private int size;
	
	@NonNull
	@NotNull
	@Size(min = 5, max = 21, message = "Company is not withing range of 5 to 21")
	private String company;
	
	@Min(value = 10000, message = "price is not withing range 10000 to 25021")
	@Max(value = 25021, message = "price is not withing range 10000 to 25021")
	private int price;
	
	@NonNull
	@NotNull
	@Size(min = 3, max = 20, message = "developername is not withing range of 3 to 20")
	private String developerName;

}
