package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Lamp {
	public static String name;
	public String type;
	public double price;
	public boolean polluting;
	public int totalLamps;
	public Color colorOfflame = Color.RED;

	public Lamp(String type, boolean polluting, Color colorOfflame) {
		super();
		this.type = type;
		this.polluting = polluting;
		this.colorOfflame = colorOfflame;
	}
	static {
		name = "petromax";
	}

	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}

	public void displayTotalPrice() { // this is get total prices
		double total = this.totalLamps * this.price;
		System.out.println("total count of lamps are " + total);
		System.out.println(System.lineSeparator());
	}

	public void spredLight() { // this is instance method
		System.out.println("lamp name is " + Lamp.name);
		System.out.println("lamp type is " + this.type);
		System.out.println("lamp boxes are " + this.price);
		System.out.println("lamp polluting is " + this.polluting);
		System.out.println("lamp total  counts are " + this.totalLamps);
		System.out.println("lamp color is " + this.colorOfflame);

	}

}
