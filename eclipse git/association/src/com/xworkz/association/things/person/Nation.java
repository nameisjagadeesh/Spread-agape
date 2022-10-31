package com.xworkz.association.things.person;

public class Nation {
	public String name;
	public String capital;
	public double population;
	public int code;

	public Nation(String name, String capital, double population, int code) {
		super();
		this.name = name;
		this.capital = capital;
		this.population = population;
		this.code = code;
	}

	public void show() {
		System.out.println("Country name:" + name);
		System.out.println("capital:" + capital);
		System.out.println("population:" + population);
		System.out.println("Country code:" + code);
		System.out.println("===============================");

	}

}
