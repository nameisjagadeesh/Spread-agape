package com.xworkz.copy.examples;
//laptop is a class or datatype or object or non primitive
//here brand brand is a static variable and it cant be copied
//price,weight,type,quantity are instance variable and they can be copied

public class Laptop {
	public static String brand="dell";
	public long price;
	public double weight;
	public String type;
	public short quantity;
	
	public Laptop() {
		System.out.println("this difference between static and instance variable");
	}
	
	public Laptop(long price,double weight,String type,short quantity) {
		this.price=price;
		this.type=type;
		this.weight=weight;
		
		System.out.println("details of laptop by instance variables=long price, double weight ,String type");
		
	}
	

}
