package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired()
	@Qualifier("nameOfPencil")
	private String name;
	@Autowired()
	@Qualifier("typeOfPencil")
	private String type;
	@Autowired()
	@Qualifier("priceOfPencil")
	private double price;
	@Autowired()
	private boolean sharp;
	@Autowired()
	@Qualifier("isStollen")
	private boolean stollen;

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", sharp=" + sharp + ", stollen="
				+ stollen + "]";
	}

}
