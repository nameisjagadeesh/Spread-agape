package com.xworkz.copy.examples;

public class Passport {
	public double no;
	public String name;
	public String country;
	public String expiryDate;
	public int price;

	public Passport(double no) {
		this.no = no;
	}
	
	public Passport(String name ) {
		this.name = name;
	}
	
	public Passport(String name,double no ) {
		this.name = name;
		this.no=no;
	}
	public Passport(int price) {
		this.price = price;
	}
	public Passport(int price,String country) {
		this.price = price; 
		this.country=country;
	}
	public Passport(int price,String country,double no) {
		this.price = price;
		this.country=country;
		this.no=no;
	}
	public Passport(int price,double no) {
		this.price = price;
		this.no=no;
	}
	
	public Passport(int price,double no,String expiryDate) {
		this.price = price;
		this.no=no;
		this.expiryDate=expiryDate;
	}
	
	
	
	

}
