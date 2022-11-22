package com.xworkz.inheritance.equals;

public class Vehicle {
	private String type;
	private double weight;
	private char code;
	private int quantity;
	private boolean safe;
	private String name;
	private long price;
	private String brand;
	private int lifeSpan;

	public Vehicle() {
		System.out.println("default constructor of vehicle");
	}

	public Vehicle(String type, double weight, char code, int quantity, boolean safe, String name, long price,
			String brand, int lifeSpan) {
		super();
		this.type = type;
		this.weight = weight;
		this.code = code;
		this.quantity = quantity;
		this.safe = safe;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.lifeSpan = lifeSpan;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", weight=" + weight + ", code=" + code + ", quantity=" + quantity + ", safe="
				+ safe + ", name=" + name + ", price=" + price + ", brand=" + brand + ", lifeSpan=" + lifeSpan + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Vehicle) { //checking about instance of
	    	 System.out.println("obj is the instance of vehicle ");
	    	 Vehicle vehicle3=(Vehicle)obj; //casting 
	    	 if(this.brand.equals(vehicle3.brand)) {
	    		 System.out.println("brand is same");
	    		 return true;
	    	 }else {
	    		 System.err.println("brand is not same ");
	    		 return false;
	    	 }
	     }
	     else {
	    	 System.err.println("obj is not a instance of vehicle");
	     }
		return super.equals(obj);
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

	public boolean isSafe() {
		return safe;
	}

	public void setSafe(boolean safe) {
		this.safe = safe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
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
