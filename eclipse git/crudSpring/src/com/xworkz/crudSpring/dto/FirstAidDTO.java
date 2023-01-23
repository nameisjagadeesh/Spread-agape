package com.xworkz.crudSpring.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//this class should not be managed by spring as the properties of this dto changes
//so no @component should be used
public class FirstAidDTO extends AbstactAuditDTO {

	@NotBlank
	@NotNull
	@Size(min = 6, max = 15, message = "the name  size is not in range")
	private String name;

	@Max(value = 5236, message = "price is not in range")
	@Min(value = 1235, message = "price is not in range")
	private int price;

	@NotBlank
	@NotNull
	@Size(min = 6, max = 24, message = "the type  size is not in range")
	private String type;

}
