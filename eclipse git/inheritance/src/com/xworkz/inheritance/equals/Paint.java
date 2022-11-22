package com.xworkz.inheritance.equals;

public class Paint {
	private String type;
	private double weight;
	private char code;
	private int quantity;
	private boolean sticky;
	private String name;
	private double price;
	private String brand;
	private int lifeSpan;

	public Paint() {
		System.out.println("default constructor of paint");
	}

	public Paint(String type, double weight, char code, int quantity, boolean sticky, String name, double price,
			String brand, int lifeSpan) {
		super();
		this.type = type;
		this.weight = weight;
		this.code = code;
		this.quantity = quantity;
		this.sticky = sticky;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.lifeSpan = lifeSpan;
	}

	@Override
	public boolean equals(Object obj) {
     if(obj instanceof Paint) { //checking about instance of
    	 System.out.println("obj is the instance of paint ");
    	 Paint paint=(Paint)obj; //casting 
    	 if(this.brand.equals(paint.brand)) {
    		 System.out.println("brand is same");
    		 return true;
    	 }else {
    		 System.err.println("brand is not same ");
    		 return false;
    	 }
     }
     else {
    	 System.err.println("obj is not a instance of paint");
     }
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Paint [type=" + type + ", weight=" + weight + ", code=" + code + ", quantity=" + quantity + ", sticky="
				+ sticky + ", name=" + name + ", price=" + price + ", brand=" + brand + ", lifeSpan=" + lifeSpan + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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

	public boolean isSticky() {
		return sticky;
	}

	public void setSticky(boolean sticky) {
		this.sticky = sticky;
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
