package com.xworkz.valantineValidation.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValentineDTO {

	@NotBlank
	@NotNull
	@Size(min = 3,max = 22,message = "name is not within range")
	private String name;
	@NotBlank
	@NotNull
	@Size(min = 3,max = 22,message = "name is not within range")
	private String valentine;
	@NotBlank(message = "place should be selected")
	private String place;
	@NotBlank(message = "gift should be selected")
	private String gift;
	private int id;
}
