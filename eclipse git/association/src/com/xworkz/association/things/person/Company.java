package com.xworkz.association.things.person;

public class Company {
	public String name;
	public String ownerName;
	public Location location;

	public Company(String name, String ownerName) {//method initalisation
		super();
		this.name = name;
		this.ownerName = ownerName;
	}

	public void setLocation(Location location) {//method initalisation
		this.location = location;
	}

	public void show() {
		System.out.println("Compnay name:" + name);
		System.out.println("ownerName:" + ownerName);
		if (this.location != null) {
			
			this.location.show();
		}
	}

}
