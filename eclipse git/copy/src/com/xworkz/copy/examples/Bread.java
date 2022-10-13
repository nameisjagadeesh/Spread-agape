package com.xworkz.copy.examples;

//here no two same datatypes cant be declared as parameters to ovrload ex;(String type,String  shape) eclipse will show the duplicate

public class Bread {
	public String type;
	public String shape;
	public int price;
	public boolean quality;
	public String companyName;

	public Bread(String type) {
		this.type = type;
	}

	public Bread(String type, boolean quality) {
		this.type = type;
		this.quality = quality;
	}

	public Bread(String shape, int price) {
		this.shape = shape;
		this.price = price;

	}

	public Bread(String companyName,boolean quality,int price) {
		this.quality=quality;
		this.companyName = companyName;
		this.price=price;

	}

	public Bread(boolean quality, String companayName) {
		this.companyName = companayName;
		this.quality = quality;

	}

	public Bread(boolean quality) {
		this.quality = quality;
	}

	public Bread(int price) {
		this.price = price;
	}

	public Bread(int price, String type) {
		this.price = price;
		this.type = type;
	}

}
