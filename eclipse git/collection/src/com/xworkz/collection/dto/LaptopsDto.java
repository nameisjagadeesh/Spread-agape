package com.xworkz.collection.dto;

public class LaptopsDto {
	private String name;
	private double price;
	private int quantity;
	private String brand;
	private boolean fast;
	public LaptopsDto(String name, double price, int quantity, String brand, boolean fast) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.fast = fast;
	}
	@Override
	public String toString() {
		return "LaptopsDto [name=" + name + ", price=" + price + ", quantity=" + quantity + ", brand=" + brand
				+ ", fast=" + fast + "]";
	}
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof LaptopsDto) {
				LaptopsDto dto=(LaptopsDto) obj;
				if(this.brand.equals(dto.brand)) {
					System.out.println("brand is matched"+dto);
					return this.fast;
				}
			}
		}
		return false;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public boolean isFast() {
		return fast;
	}
	public void setFast(boolean fast) {
		this.fast = fast;
	}
	

}
