package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Rocket {

	private String name;
	private String country;
	private Double budget;

	public Rocket(@Value("Sputnic") String name, @Value("Russia") String country, @Value("6523D") Double budget) {
		this.budget = budget;
		this.name = name;
		this.country = country;

	}

	public Double getBudget() {
		return budget;
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

}
