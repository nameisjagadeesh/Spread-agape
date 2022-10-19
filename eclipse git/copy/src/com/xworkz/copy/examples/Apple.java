package com.xworkz.copy.examples;
//here i declared the instance methods to access all details
public class Apple {
	public double temperature;
	public String name;
	public long[] totalFruits;
	public String[] color;
	public double[] weight;
	public String sugarLevel;
	public String type;
	public short lifespan;
	public int[] sale;
	public double[] width;
	public String[] location;

	public Apple(double temperature, String name, long[] totalFruits, String[] color, double[] weight,
			String sugarLevel, String type, short lifespan, int[] sale, double[] width, String[] location) {
		this.name = name;
		this.temperature = temperature;
		this.color = color;
		this.totalFruits = totalFruits;
		this.weight = weight;
		this.type = type;
		this.lifespan = lifespan;
		this.sale = sale;
		this.width = width;
		this.location = location;
		this.sugarLevel = sugarLevel;

	}

	public void eatApple() { //instance method declaration
		System.out.println(this.name);
		System.out.println(this.sugarLevel);
		System.out.println(this.type);
		System.out.println(this.totalFruits);
		System.out.println(this.color);
		System.out.println(this.weight);
		System.out.println(this.width);
		System.out.println(this.temperature);
		System.out.println(this.lifespan);
		System.out.println(this.sale);
		System.out.println(this.location);
		
		for (int i = 0; i < this.color.length; i++) {
			String string = color[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.totalFruits.length; i++) {
			long string = totalFruits[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.weight.length; i++) {
			double string = weight[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.sale.length; i++) {
			int string = sale[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.width.length; i++) {
			double string = width[i];
			System.out.println(string);
			
		}
		for (int i = 0; i < this.location.length; i++) {
			String string = location[i];
			System.out.println(string);
			
		}

	}

}
