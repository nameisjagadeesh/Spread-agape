package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Sweet {

	public static String brand;
	public String name;
	public double price;
	public boolean taste;
	public int quantity;
	public Color color = Color.WHITE;  //this is enum declaration n initialisation of color

	public Sweet(String name,Color color) { // this is constructor initialisation
		this.name = name;
		this.color=color;
	}

	static {
		brand = "motilal"; // this literal initialisation
	}

	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}

	public void displayTotalPrice() { // this is get total prices
		double total = this.quantity * this.price;
		System.out.println("total price of sweets"+total);
	}

	public void eatSweets() {  //this is instance method
		System.out.println("sweet brand is "+Sweet.brand);
		System.out.println("sweet name is "+this.name);
		System.out.println("sweet price is "+this.price);
		System.out.println("sweet taste is "+this.taste);
		System.out.println("sweet quantity is "+this.quantity);
		System.out.println("sweet color is "+this.color);
		
	}

}
