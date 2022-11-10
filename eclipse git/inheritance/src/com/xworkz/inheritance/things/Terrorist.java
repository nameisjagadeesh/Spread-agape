package com.xworkz.inheritance.things;

public class Terrorist {
	public String country;
	public String offence;
	public double age;

	public Terrorist() {
		System.out.println("default constructor of terrorist");
	}

	public Terrorist(String country, String offence, double age) {
		super();
		this.country = country;
		this.offence = offence;
		this.age = age;
	}

	public void attacks() {
		System.out.println("terrorist starts attacking");
		System.out.println(this.age);
		System.out.println(this.offence);
		System.out.println(this.country);
	}

	public void arrest() {
		System.out.println("terrorist has been arrested");
	}

}
