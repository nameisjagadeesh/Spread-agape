package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Flower {
	public static String name;
	public String type;
	public double boxes;
	public boolean fragranance;
	public int totalCount;
	public Color colorOfflower = Color.BLACK;

	public Flower(String type, boolean fragranance, Color colorOfflower) {
		super();
		this.type = type;
		this.fragranance = fragranance;
		this.colorOfflower = colorOfflower;
	}

	static {
		name = "rose";
	}

	public void setBox(double boxes) { // this is method initialisation
		this.boxes = boxes;
	}

	public void displayTotalFlowers() { // this is get total prices
		double total = this.totalCount * this.boxes;
		System.out.println("total count of flowers are " + total);
		System.out.println(System.lineSeparator());
	}

	public void feelFLower() { // this is instance method
		System.out.println("flower name is " + Flower.name);
		System.out.println("flower type is " + this.type);
		System.out.println("flower boxes are " + this.boxes);
		System.out.println("flower fragnance is " + this.fragranance);
		System.out.println("flower total  counts are " + this.totalCount);
		System.out.println("flower color is " + this.colorOfflower);

	}

}
