package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Milk {
	public static String brand;
	public String type;
	public double price;
	public boolean quality;
	public int totalPackets;
	public Color colorOfMilk=Color.WHITE;
	public Milk(String type, boolean quality, Color colorOfMilk) {
		super();
		this.type = type;
		this.quality = quality;
		this.colorOfMilk = colorOfMilk;
	}
	
	static {
		brand = "nandini";
	}

	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}

	public void displayTotalPrice() { // this is get total prices
		double total = this.totalPackets * this.price;
		System.out.println("total price of milks are " + total);
		System.out.println(System.lineSeparator());
	}

	public void printmilkDetails() { // this is instance method
		System.out.println("milk brand is " + Milk.brand);
		System.out.println("milk type is " + this.type);
		System.out.println("milk price are " + this.price);
		System.out.println("milk quality is " + this.quality);
		System.out.println("milk total  counts are " + this.totalPackets);
		System.out.println("milk color is " + this.colorOfMilk);

	}
}
