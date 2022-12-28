package com.xworkz.collection.dto;

import java.io.Serializable;

public class AirportDTO implements Serializable {
	private String name;
	private Integer capicity;
	private String country;

	public AirportDTO(String name, Integer capicity, String country) {
		super();
		this.name = name;
		this.capicity = capicity;
		this.country = country;
	}

	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", capicity=" + capicity + ", country=" + country + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj !=null) {
			if(obj instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto);
					return true;
				}
				else {
					System.err.println("name is not matching "+dto);
				}
			}
		}
		return false;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCapicity() {
		return capicity;
	}

	public void setCapicity(Integer capicity) {
		this.capicity = capicity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
