package com.xworkz.copy.examples;
//here i declared the methods to access all details

public class Plant {
	public String name;

	public int[] totalPlants;
	public String[] color;
	public double[] weight;
	public int oxygenLevel;
	public String type;
	public short lifespan;
	public long[] population;
	public double[] length;
	public String[] location;

	public Plant(String name, int[] totalPlants, String[] color, double[] weight, int oxygenLevel, String type,
			short lifespan, long[] population, double[] length, String[] location) {
		this.name = name;

		this.totalPlants = totalPlants;
		this.color = color;
		this.oxygenLevel = oxygenLevel;
		this.weight = weight;
		this.type = type;
		this.lifespan = lifespan;
		this.population = population;
		this.length = length;
		this.location = location;
	}

	public void details() {
		System.out.println(this.name);

		System.out.println(this.type);
		System.out.println(this.totalPlants);
		System.out.println(this.color);
		System.out.println(this.weight);
		System.out.println(this.oxygenLevel);
		System.out.println(this.population);
		System.out.println(this.lifespan);
		System.out.println(this.length);
		System.out.println(this.location);

		for (int i = 0; i < this.color.length; i++) {
			String string = color[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.length.length; i++) {
			double string = length[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.totalPlants.length; i++) {
			int string = totalPlants[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.weight.length; i++) {
			double string = weight[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.population.length; i++) {
			long string = population[i];
			System.out.println(string);

		}
		for (int i = 0; i < this.location.length; i++) {
			String string = location[i];
			System.out.println(string);

		}
	}

}
