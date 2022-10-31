package com.xworkz.association.things.person;

public class MetroCity {
	public String name;
	public double population;
	public double pincode;
	public String specality;

	public MetroCity(String name, double population, double pincode, String specality) {
		super();
		this.name = name;
		this.population = population;
		this.pincode = pincode;
		this.specality = specality;
	}

	public void show() {
		System.out.println("cityname:" + name);
		System.out.println("population:" + population);
		System.out.println("pincode:" + pincode);
		System.out.println("specality:" + specality);
		System.out.println("===============================");
	}

}
