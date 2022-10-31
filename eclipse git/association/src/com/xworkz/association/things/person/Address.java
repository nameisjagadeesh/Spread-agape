package com.xworkz.association.things.person;

public class Address {
	public Location location;

	public Address() {

	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void showOff() {
		if (this.location != null) {
			this.location.show();
		}
	}

}
