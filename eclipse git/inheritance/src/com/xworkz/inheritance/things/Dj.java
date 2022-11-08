package com.xworkz.inheritance.things;

public class Dj {
	public String name;
	public int noDjs;
	public long price;

	public Dj() {
		System.out.println("default constructor of Dj ");
	}

	public Dj(String name, int noDjs, long price) {
		super();
		this.name = name;
		this.noDjs = noDjs;
		this.price = price;
	}
    
}
