package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Crackers {
	public static String brand;
	public String name;
	public double price;
	public boolean noisy;
	public int totalCount;
	public Color colorOfCrackers = Color.BLACK;

	public Crackers(String name, boolean noisy, Color colorOfCrackers) {
		super();
		this.name = name;
		this.noisy = noisy;
		this.colorOfCrackers = colorOfCrackers;
	}

	static {
		brand = "sivakasi";
	}

	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}

	public void displayTotalPrice() { // this is get total prices
		double total = this.totalCount * this.price;
		System.out.println("total price of crackers" + total);
		System.out.println(System.lineSeparator());
	}

	public void blastCrackers() { // this is instance method
		System.out.println("Crackers brand is " + Crackers.brand);
		System.out.println("Crackers name is " + this.name);
		System.out.println("Crackers price is " + this.price);
		System.out.println("Crackers neat is " + this.noisy);
		System.out.println("Crackers total customers are " + this.totalCount);
		System.out.println("Crackers color is " + this.colorOfCrackers);

	}

}
