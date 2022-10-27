package com.xworkz.association.things;

public class Weapon {
	public String name;
	public String use;
	public double weight;

	public Weapon(String name, String use, double weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;
	}

	public void show() {
		System.out.println("weapon name " + name);
		System.out.println("weapon use " + use);
		System.out.println("weapon weight " + weight);

	}

}
