package com.xworkz.springautowired.bean.associationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;
	@Autowired
	private Area area;
	public Company() {
		System.out.println("created company using default constructor");
	}
}

