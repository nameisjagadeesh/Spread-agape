package com.xworkz.association.things;

import com.xworkz.association.constants.FuelType;

public class Fuel {
	public boolean special = true;
	public Brand brand;
	public FuelType type = FuelType.DIESEL;
	public double price;
	public double quantity; 
	

	public Fuel(boolean special, double price, double quantity) {
		super();		
		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}

	public void totalPrice() {
		double total =this. price * quantity;
		System.out.println("Total price  " + total + "Rs");
		System.out.println("~~~~~~~~~~~~~~~");
	}

	public void reading() {
		System.out.println("accessing the details of fuel ");
		Brand brand = new Brand("indian oil", "653AAACH1118B1ZI", "chandralayout", "5star");
		brand.showOff();
		System.out.println("fuel type special"+this.special);
		System.out.println("fuel price is"+this.price + "Rs");
		System.out.println("fuel quantity is"+this.quantity + "L");
		System.out.println("fuel type is"+this.type);

	}

}
