package com.xworkz.copy.boot;
//12th
//here i declared the instance methods to access all details
//shortcut to declare and initialise constructor alr+shift+s+o
public class Xray {
	public String[] material;
	public char code;
	public String type;
	public int[] quantity;
	public String []color;
	public double[] weight;
	public short thickness;
	public String usedBy;
	public boolean good;
	public int[] lightsPassed;
	public double[] width;
	
	public Xray(String[] material, char code, String type, int[] quantity, String[] color, double[] weight,
			short thickness, String usedBy, boolean good, int[] lightsPassed, double[] width) {
		super();
		this.material = material;
		this.code = code;
		this.type = type;
		this.quantity = quantity;
		this.color = color;
		this.weight = weight;
		this.thickness = thickness;
		this.usedBy = usedBy;
		this.good = good;
		this.lightsPassed = lightsPassed;
		this.width = width;
	}
	
	public void testIt() {
		System.out.println(this.code);
		System.out.println(good);
		System.out.println(this.type);
		System.out.println(this.usedBy);
		System.out.println(this.thickness);
		
		for (int i = 0; i < material.length; i++) {
			System.out.println("material:" + material[i]);
		}
		for (int i = 0; i < quantity .length; i++) {
			System.out.println("quantity:" + quantity[i]);
		}
		for (int i = 0; i < lightsPassed.length; i++) {
			System.out.println("lightsPassed:" + lightsPassed[i]);
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
