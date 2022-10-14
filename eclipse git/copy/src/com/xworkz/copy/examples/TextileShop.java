package com.xworkz.copy.examples;

//constructor chaining==super and this

public class TextileShop {
	public String name;
	public char shopCode;
	public int number;
	public String adress;
	public long totalValue;

	public TextileShop() {
		System.out.println("super chaining of TextileShop");

	}

	public TextileShop(String name) {
		this(); //super chaining
		this.name = name;
	}

	public TextileShop(String name, char shopCode) {
		this(name); //this chaining
		this.shopCode = shopCode;
	}

	public TextileShop(String name, char shopCode, int number) {
		this(name, shopCode);
		this.number = number;
	}

	public TextileShop(String name, char shopCode, int number, String adress) {
		this(name, shopCode, number);
		this.adress = adress;
	}

	public TextileShop(String name, char shopCode, int number, String adress, long totalValue) {
		this(name, shopCode, number, adress);
		this.totalValue = totalValue;
	}

	public TextileShop(String name, long totalValue) {
		this(name);
		this.totalValue = totalValue;
	}

	public TextileShop(char shopCode, String name, String adress) {
		this(name, shopCode);
		this.adress = adress;
	}

	public TextileShop(long totalValue, int number) {
		this.totalValue = totalValue;
		this.number = number;
	}

}
