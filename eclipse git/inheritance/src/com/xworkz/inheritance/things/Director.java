package com.xworkz.inheritance.things;

public class Director {
	public String type;
	public String industryName;
	public Director() {
		// TODO Auto-generated constructor stub
	}
	public Director(String type, String industryName) {
		super();
		this.type = type;
		this.industryName = industryName;
	}
	public void direct() {
		System.out.println(this.type);
		System.out.println(this.industryName);
	}

}
