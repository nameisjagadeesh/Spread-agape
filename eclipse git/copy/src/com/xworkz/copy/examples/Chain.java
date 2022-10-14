package com.xworkz.copy.examples;
//constructor chaining of class Chain==super n this types

public class Chain {
	public String type;
	public char code;
	public long price;
	public String company;
	public double weight;
	public int quantity;

	public Chain() {
		System.out.println("constructor chaining of class chain");
	}

	public Chain(String type) { //decalaring the constructor
		this();  //super
		this.type = type;
	}

	public Chain(String type, char code) {
		this(type); //this type chaining
		this.code = code;
	}

	public Chain(String type, char code, long price) {
		this(type, code);
		this.price = price;
	}

	public Chain(String type, char code, long price, String company) {
		this(type, code, price);
		this.company = company;
	}

	public Chain(String type, char code, long price, String company, double weight) {
		this(type, code, price, company);
		this.weight = weight;
	}

	public Chain(String type, char code, long price, String company, double weight, int quantity) {
		this(type, code, price, company, weight);
		this.quantity = quantity;
	}

	public Chain(String type, double weight) {
		this(type);
		this.weight = weight;
	}

	public Chain(String type, char code, long price, int quantity) {
		this(type, code, price);
		this.quantity = quantity;
	}

}
