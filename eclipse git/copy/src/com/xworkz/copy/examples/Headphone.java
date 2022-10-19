package com.xworkz.copy.examples;
//11th
//here i declared the instance methods to access all details
//shortcut to declare and initialise constructor alr+shift+s+o
public class Headphone {
	public String brand;
	public char code;
	public String type;
	public int[] price;
	public String []color;
	public double[] weight;
	public short accessories;
	public String[] producedBy;
	public boolean Anc;
	public int[] warranty;
	public double[] parts;
	
	public Headphone(String brand, char code, String type, int[] price, String[] color, double[] weight,
			short accessories, String[] producedBy, boolean anc, int[] warranty, double[] parts) {
		super();
		this.brand = brand;
		this.code = code;
		this.type = type;
		this.price = price;
		this.color = color;
		this.weight = weight;
		this.accessories = accessories;
		this.producedBy = producedBy;
		Anc = anc;
		this.warranty = warranty;
		this.parts = parts;
	}
	public void hearit() {
		System.out.println(this.brand);
		System.out.println(Anc);
		System.out.println(this.accessories);
		System.out.println(this.type);
		System.out.println(this.code);
		
		for (int i = 0; i < price.length; i++) {
			System.out.println("price:" + price[i]);
		}
		for (int i = 0; i < color .length; i++) {
			System.out.println("color:" + color[i]);
		}
		for (int i = 0; i < producedBy.length; i++) {
			System.out.println("producedBy:" + producedBy[i]);
		}
		for (int i = 0; i < warranty.length; i++) {
			System.out.println("years:" + warranty[i]);
		}
		for (int i = 0; i < parts.length; i++) {
			System.out.println("headphones parts:" + parts[i]);
		}
		for (int i = 0; i < weight.length; i++) {
			System.out.println("weighs:" + weight[i]);
		}
	}
	
	
	

}
