package com.xworkz.association.boot;

import com.xworkz.association.things.Fuel;

public class FuelRunner {

	public static void main(String[] args) {
		
		System.out.println("invoked the fuel ,fueltype ");
		Fuel fuel=new Fuel(true, 112.36, 51);
		fuel.totalPrice();
		fuel.reading();
		
	}

}
