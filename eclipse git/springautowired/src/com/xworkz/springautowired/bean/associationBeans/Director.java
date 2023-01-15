package com.xworkz.springautowired.bean.associationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	private Experiance experience;
	@Autowired
	private Skill skill;
	
	public Director() {
		System.out.println("created director using default constructor");
	}

}
