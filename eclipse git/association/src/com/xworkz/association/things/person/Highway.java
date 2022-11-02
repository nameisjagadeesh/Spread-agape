package com.xworkz.association.things.person;

public class Highway {
	public String type;
	public int lanes;
	public Road road=new Road("mg road", 60, 7.5, true);
	public Highway(String type, int lanes, Road road) {
		super();
		this.type = type;
		this.lanes = lanes;
		this.road = road;
	}
	
	public void showOff() {
		System.out.println(this.type);
		System.out.println(this.lanes);
		if(this.road!=null) {
		System.out.println(this.road.getName());
		this.road.details();
		}
		System.out.println(this.road.length);
		System.out.println(this.road.width);
		System.out.println(this.road.safe);
	}

}
