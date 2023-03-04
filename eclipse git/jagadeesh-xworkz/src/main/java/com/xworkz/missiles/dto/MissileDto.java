package com.xworkz.missiles.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class MissileDto {

	private int id;
	@Size(min = 3,max = 25,message = "name is not within range of 3 and 25")
	private String name;
	@Size(min = 3,max = 25 ,message = "company is not within range of 3 and 25")
	private String company;
	@Size(min = 3,max = 25 ,message = "country is not within range of 3 and 25")
	private String country;
	@NotNull(message = "price should not be empty")
	private Double price;
	@Size(min = 3,max = 25 ,message = "type is not within range of 3 and 25")
	private String type;
}
