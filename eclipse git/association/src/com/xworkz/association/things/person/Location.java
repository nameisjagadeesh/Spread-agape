package com.xworkz.association.things.person;

public class Location {
	public int no;
	public String street;
	public MetroCity city;
	public State state;
	public Nation nation;

	public Location(int no, String street) {
		super();
		this.no = no;
		this.street = street;

	}

	public void setCity(MetroCity city, State state, Nation nation) {//method initalisation
		this.city = city;
		this.state = state;
		this.nation = nation;
	}

	public void show() {
		System.out.println("No:" + no);
		System.out.println("street:" + street);
		if (this.city != null) {
			// System.out.println(this.city);
			this.city.show();
		}
		if (this.state != null) {

			// System.out.println(this.state);
			this.state.show();
		}
		if (this.nation != null) {
			// System.out.println(this.nation);
			this.nation.show();
		}
	}

}
