package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	@Autowired()
	@Qualifier("nameOfRubber")
	private String name;
	@Autowired()
	@Qualifier("typeOfRubber")
	private String type;
	@Autowired()
	@Qualifier("priceOfRubber")
	private double price;
	@Autowired()
	@Qualifier("colorOfRubber")
	private String color;
	@Autowired()
	@Qualifier("shapeOfRubber")
	private String shape;
	@Autowired()
	@Qualifier("stollenRubber")
	private boolean stolen;
	@Autowired()
	@Qualifier("sizeOfRubber")
	private char size;

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}
