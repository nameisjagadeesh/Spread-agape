package com.xworkz.copy.examples;

import com.xworkz.copy.constants.OwnerName;

public class Usb {

	public static final String BRAND; // here i made brand variable as static and final which means i cant
										// change or make a copy
	public int price;
	public static double weight;
	public short quantity;
	public String type;
	public char code;
	public static float width;
	public OwnerName name = OwnerName.JAGADEESH;

	public Usb(int price, short quantity, String type, char code, OwnerName name) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.type = type;
		this.code = code;
		this.name = name;
	}

	static {
		weight = 123.2;
		width = 3.2f;
		BRAND = "SANDISK"; //or we can initialise at class level BRAND="SANDISK")

	}

	public void readUsb() {
		System.out.println("ownername of USB is " + this.name);
		System.out.println("price of USB is " + this.price + "Rs");
		System.out.println("quantity of USB are " + this.quantity);
		System.out.println("type of USB is " + this.type);
		System.out.println("code of USB is " + this.code);
		System.out.println("band of USB is " + Usb.BRAND);
		System.out.println("weigh of USB is " + Usb.weight + "gms");
		System.out.println("width of USB is " + Usb.width + "cm");

	}

}
