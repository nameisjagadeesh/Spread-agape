package com.xworkz.copy.examples;

//in this methods are declared after the constructor to pass args

public class Tyre {

	public String brand;
	public char code;
	public String type;
	public int[] price;
	public String color;
	public double[] weight;
	public double[] perimeter;
	public String[] factoryNames;
	public short branches;
	public long[] revenues;
	public double[] radius;

	public Tyre(String brand,char code, String type, int[] price, String color, double[] weight, double[] perimeter,
			String[] factoryNames, short branches, long[] revenues, double[] radius) {
		System.out.println("parameterized constructr of tyre class");
		this.brand=brand;
		this.code = code;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.perimeter = perimeter;
		this.factoryNames = factoryNames;
		this.branches = branches;
		this.revenues = revenues;
		this.radius = radius;

	}

	public void tyreDetails() {
		// here i declared the method in instance to acccess all details at once in
								// runner class files
		System.out.println(this.brand);
		System.out.println(this.code);
		System.out.println(this.type);
		System.out.println(this.branches);
		System.out.println(this.color);
		System.out.println(this.factoryNames);
		System.out.println(this.price);
		System.out.println(this.perimeter);
		System.out.println(this.weight);
		System.out.println(this.radius);
		System.out.println(this.revenues);
		

		System.out.println("=========now for loop=========");

		for (int i = 0; i < this.factoryNames.length; i++) {
			System.out.println("elements of factory names");
			String string = this.factoryNames[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.price.length; i++) {
			System.out.println("elements of factory tyres prices");
			int string1 = this.price[i];
			System.out.println(string1);

		}
		for (int i = 0; i < this.weight.length; i++) {
			System.out.println("elements of tyre weights");
			double weight = this.weight[i];
			System.out.println(weight);

		}
		for (int i = 0; i < this.perimeter.length; i++) {
			double perimeter = this.perimeter[i];
			System.out.println("elements of tyre perimeters");
			System.out.println(perimeter);

		}
		for (int i = 0; i < this.radius.length; i++) {
			double radius = this.radius[i];
			System.out.println("elements of tyre radius");
			System.out.println(radius);

		}
		for (int i = 0; i < this.revenues.length; i++) {
			long revenue = this.revenues[i];
			System.out.println("elements of tyre revenues");
			System.out.println(revenue);

		}

	}

}
