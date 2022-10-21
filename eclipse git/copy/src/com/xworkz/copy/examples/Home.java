package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Floors;
import com.xworkz.copy.constants.OwnerName;
//this is program on enum datatype

public class Home {
	public int rooms;
	public String type;
	public OwnerName name = OwnerName.JAGADEESH;
	public Floors floors = Floors.FIVE;
	public int rent;
	public boolean affordable;

	public Home(int rooms, String type, OwnerName name, Floors floors, int rent, boolean affordable) {
		super();
		this.rooms = rooms;
		this.type = type;
		this.name = name;
		this.floors = floors;
		this.rent = rent;
		this.affordable = affordable;
	}

	public void display() {
		System.out.println("total rooms:" + this.rooms);
		System.out.println("type of home:" + this.type);
		System.out.println("ownername is :" + this.name);
		System.out.println("total floors are :" + this.floors);
		System.out.println("total floors numbers are :" + this.floors.number);
		System.out.println("rent is :" + this.rent);
		System.out.println("is it affordable :" + this.affordable);
	}

}
