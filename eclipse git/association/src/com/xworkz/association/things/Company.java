package com.xworkz.association.things;

public class Company {
	public String name;
	public String type;
	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}
	
	public void showOff() {
		System.out.println("invoking the company");
		System.out.println(this.name);
		System.out.println(this.type);
		
	}
	
}
