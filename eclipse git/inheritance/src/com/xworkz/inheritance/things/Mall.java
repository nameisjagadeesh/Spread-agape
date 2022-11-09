package com.xworkz.inheritance.things;

public class Mall {
	public String location;
	public int totalShops;

	public Mall() {
		// TODO Auto-generated constructor stub
	}

	public Mall(String location, int totalShops) {
		super();
		this.location = location;
		this.totalShops = totalShops;
	}

	public void shopping() {
		System.out.println(location);
		System.out.println(totalShops);
	}

}
