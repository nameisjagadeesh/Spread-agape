package com.xworkz.inheritance.things;

public class Crocs extends FootWear {
	public String name = "crocs";
	public int price = 3652;
	public double weight = 550; // gms
	public double quantity=12;

	public Crocs() {
		System.out.println("initated crocs using default constructor");
	}

	public Crocs(String name, int price, double weight,double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.quantity = quantity;
	}
	
	public void totalPrice() {
		int totalPrice=(int) (this.price*this.quantity);
		System.out.println("total price is="+totalPrice+ "Rs only");
	}

	public void details() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.weight);
		System.out.println(this.quantity);
	}

}
