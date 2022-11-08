package com.xworkz.inheritance.things;

public class Catering {
	public String type;
	public short workers;
	public int charges;

	public Catering() {
		System.out.println("default constrctor of catering ");
	}

	public Catering(String type, short workers, int charges) {
		super();
		this.type = type;
		this.workers = workers;
		this.charges = charges;
	}
	public void printDetails() {
		System.out.println(type);
		System.out.println(workers);
		System.out.println(charges);
	}
}
