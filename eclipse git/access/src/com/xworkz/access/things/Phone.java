package com.xworkz.access.things;

public class Phone {
	private String brand = "oneplus";
	private String color = "black";
	private String phoneName = "oneplus 5t";
	private int quantity = 12;
	private boolean durable = true;
	private double weight = 163;
	private long price = 14563L;
	private String type = "flagship";
	private char code = 'M';
	private String outlet = "experience store";
	private String location = "china";

	public String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public String getPhoneName() {
		return phoneName;
	}

	void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public int getQuantity() {
		return quantity;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isDurable() {
		return durable;
	}

	void setDurable(boolean durable) {
		this.durable = durable;
	}

	public double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	public long getPrice() {
		return price;
	}

	void setPrice(long price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	public char getCode() {
		return code;
	}

	void setCode(char code) {
		this.code = code;
	}

	public String getOutlet() {
		return outlet;
	}

	void setOutlet(String outlet) {
		this.outlet = outlet;
	}

	public String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}

}
