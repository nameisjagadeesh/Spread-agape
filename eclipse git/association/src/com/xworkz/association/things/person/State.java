package com.xworkz.association.things.person;

public class State {
	public String name;
	public String cm;
	public double pincode;
	public String capital;

	public State(String name, String cm, double pincode, String capital) {
		super();
		this.name = name;
		this.cm = cm;
		this.pincode = pincode;
		this.capital = capital;
	}

	public void show() {
		System.out.println("State name:" + name);
		System.out.println("Chief minister:" + cm);
		System.out.println("pincode:" + pincode);
		System.out.println("capital:" + capital);
		System.out.println("===============================");
	}

}
