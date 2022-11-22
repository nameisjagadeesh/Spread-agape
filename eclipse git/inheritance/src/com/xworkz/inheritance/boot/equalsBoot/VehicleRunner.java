package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle();
		vehicle.setBrand("kia");
		vehicle.setCode('V');
		vehicle.setLifeSpan(25);
		vehicle.setName("seltos");
		vehicle.setPrice(6509856L);
		vehicle.setQuantity(12);
		vehicle.setSafe(true);
		vehicle.setWeight(852.3);
		vehicle.setType("sports");
		System.out.println(vehicle);
		
		Vehicle vehicle2=new Vehicle("sports", 956.3, 'K', 20, false, "hundai", 480, "creta", 30);
		System.out.println(vehicle2);
		
		boolean ref=vehicle.equals(vehicle2);
		System.out.println(ref);
		
	}

}
