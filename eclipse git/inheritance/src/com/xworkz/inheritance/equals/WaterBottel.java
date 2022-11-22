package com.xworkz.inheritance.equals;

public class WaterBottel {
	private String type;
	private double height;
	private char code;
	private int quantity;
	private boolean quality;
	private String name;
	private double price;
	private String brand;
	private int lifeSpan;

	public WaterBottel() {
		System.out.println("default constructor of waterbottle");
	}

	public WaterBottel(String type, double height, char code, int quantity, boolean quality, String name, double price,
			String brand, int lifeSpan) {
		super();
		this.type = type;
		this.height = height;
		this.code = code;
		this.quantity = quantity;
		this.quality = quality;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.lifeSpan = lifeSpan;
	}

	@Override
	public String toString() {
		return "WaterBottel [type=" + type + ", height=" + height + ", code=" + code + ", quantity=" + quantity
				+ ", quality=" + quality + ", name=" + name + ", price=" + price + ", brand=" + brand + ", lifeSpan="
				+ lifeSpan + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof WaterBottel) { //checking about instance of
	    	 System.out.println("obj is the instance of waterbottle ");
	    	 WaterBottel bottel3=(WaterBottel)obj; //casting 
	    	 if(this.name.equals(bottel3.name)) {
	    		 System.out.println("name is same");
	    		 return true;
	    	 }else {
	    		 System.err.println("name is not same ");
	    		 return false;
	    	 }
	     }
	     else {
	    	 System.err.println("obj is not a instance of waterbottle");
	     }
		return super.equals(obj);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isQuality() {
		return quality;
	}

	public void setQuality(boolean quality) {
		this.quality = quality;
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getLifeSpan() {
		return lifeSpan;
	}

	public void setLifeSpan(int lifeSpan) {
		this.lifeSpan = lifeSpan;
	}

}
