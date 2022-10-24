package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Saloon {
	public static String brand;
	public String name;
	public double price;
	public boolean neatness;
	public int totalCustomers;
	public Color colorOfDye=Color.BLACK;
	public Saloon(String name, boolean neatness, Color colorOfDye) {
		super();
		this.name = name;
		this.neatness = neatness;
		this.colorOfDye = colorOfDye;
	}
	
	static {
		brand="loreal";
	}
	public void setPrice(double price) { // this is method initialisation
		this.price = price;
	}
	public void displayTotalPrice() { // this is get total prices
		double total = this.totalCustomers * this.price;
		System.out.println("total price of saloonCost"+total);
	}
	public void haircut() {  //this is instance method
		System.out.println("saloon brand is "+Saloon.brand);
		System.out.println("saloon name is "+this.name);
		System.out.println("saloon price is "+this.price);
		System.out.println("saloon neat is "+this.neatness);
		System.out.println("saloon total customers are "+this.totalCustomers);
		System.out.println("hairdye color is "+this.colorOfDye);
		
	}

}
