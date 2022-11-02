package com.xworkz.access.things;

public class SweatShirt {
	public String name;
	private int quantity=23;
	public String type;
	public boolean quality;
	private String brand = "roadstar";
	private double price=1005;
	public String country;
	public char code;
	public String ownerName;
	public String producedBy;
	public long totalShirts;
	
	
    
	public SweatShirt(String name, String type, boolean quality, String country, char code, String ownerName,
			String producedBy, long totalShirts) {
		super();
		this.name = name;
		this.type = type;
		this.quality = quality;
		this.country = country;
		this.code = code;
		this.ownerName = ownerName;
		this.producedBy = producedBy;
		this.totalShirts = totalShirts;
	}

	public String getBrand() {
		return brand;
	}

	 void setBrand(String brand) {
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
	
	
	 

	

}
