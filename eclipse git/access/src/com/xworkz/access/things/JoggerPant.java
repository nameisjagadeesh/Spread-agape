package com.xworkz.access.things;

public class JoggerPant {
	private String brand = "wrangler";
	public String name;
	private int quantity = 12;
	public String type;
	public boolean quality;
	private double price = 2563;
	private String country="usa";
	public char code;
	public String ownerName;
	public String producedBy;
	public long totalShirts;
	public JoggerPant(String name, String type, boolean quality, char code, String ownerName, String producedBy,
			long totalShirts) {
		super();
		this.name = name;
		this.type = type;
		this.quality = quality;
		this.code = code;
		this.ownerName = ownerName;
		this.producedBy = producedBy;
		this.totalShirts = totalShirts;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
