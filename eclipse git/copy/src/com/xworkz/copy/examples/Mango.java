package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Mango {
	public static String name;
	public String location;
	public double price;
	public boolean fresh;
	public int quantity;
	public Color colorOfMango = Color.YELLOW;

	public Mango(String location, boolean fresh, Color colorOfMango) {
		super();
		this.location = location;
		this.fresh = fresh;
		this.colorOfMango = colorOfMango;
	}

	static {
		name = "Langra";
	}

	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}

	public void displayTotalPrice() { // this is get total prices
		double total = this.quantity * this.price;
		System.out.println("total price of mangos are " + total);
		System.out.println(System.lineSeparator());
	}

	public void printMangoDetails() { // this is instance method
		System.out.println("mango name is " + Mango.name);
		System.out.println("mango location is " + this.location);
		System.out.println("mango price are " + this.price);
		System.out.println("mango fresh is " + this.fresh);
		System.out.println("mango total  counts are " + this.quantity);
		System.out.println("mango color is " + this.colorOfMango);

	}
}
