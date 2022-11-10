package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.things.Mall;

public class Orion extends Mall {
	public String owner;

	public Orion() {
		// TODO Auto-generated constructor stub
	}

	public Orion(String location, int totalShops, String owner) {
		super(location, totalShops);
		this.owner=owner;
	}
	public void shopping() {
		super.shopping();//this to overriding
		System.out.println(this.owner);
	}
	

}
