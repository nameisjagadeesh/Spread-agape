package com.xworkz.spring.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	@Value("jagadeesh")
	private String name;
	@Value("pan languages")
	private String language;
	@Value("26")
	private Double age;

	public Actor() {
		System.out.println("running the actor using default constructor");
	}

	public Double getAge() {
		return age;
	}

	public String getLanguage() {
		return language;
	}

	public String getName() {
		return name;
	}

}
