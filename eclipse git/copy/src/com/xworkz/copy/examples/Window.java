package com.xworkz.copy.examples;
//12th
//here i declared the instance methods to access all details
//shortcut to declare and initialise constructor alr+shift+s+o

public class Window {
	public String[] material;
	public char size;
	public String type;
	public int[] quantity;
	public String []color;
	public double[] weight;
	public short thickness;
	public String usedFor;
	public boolean good;
	public int[] bolts;
	public double[] width;
	public Window(String[] material, char size, String type, int[] quantity, String[] color, double[] weight,
			short thickness, String usedFor, boolean good, int[] bolts, double[] width) {
		super();
		this.material = material;
		this.size = size;
		this.type = type;
		this.quantity = quantity;
		this.color = color;
		this.weight = weight;
		this.thickness = thickness;
		this.usedFor = usedFor;
		this.good = good;
		this.bolts = bolts;
		this.width = width;
	}
public void windowSlide() {
	System.out.println(this.size);
	System.out.println(good);
	System.out.println(this.type);
	System.out.println(this.usedFor);
	System.out.println(this.thickness);
	
	for (int i = 0; i < material.length; i++) {
		System.out.println("material:" + material[i]);
	}
	for (int i = 0; i < quantity .length; i++) {
		System.out.println("quantity:" + quantity[i]);
	}
	for (int i = 0; i < bolts.length; i++) {
		System.out.println("bolts:" + bolts[i]);
	}
	for (int i = 0; i < width.length; i++) {
		System.out.println("w:" + width[i]);
	}
	for (int i = 0; i < weight.length; i++) {
		System.out.println("weighs:" + weight[i]);
	}
	for (int i = 0; i < color.length; i++) {
		System.out.println("color:" + color[i]);
	}
}
	
}
