package com.xworkz.copy.examples;

import com.xworkz.copy.constants.Color;

public class Shirt {
	public final String brand; //here making brand as final for each constructor and initialing separatly
	public String type;
	public double price;
	public boolean quality;
	public int totalShirts;
	public Color colorOfShirt = Color.BLACK;
	public Shirt(String brand) {
		super();
		this.brand = brand;
	}
	public Shirt(String type, double price, boolean quality, int totalShirts, Color colorOfShirt) {
		super();
		this.brand="mufti"; //here i initialised the brand explcitly in constructor which is used only w.r.t this construtor
		this.type = type;
		this.price = price;
		this.quality = quality;
		this.totalShirts = totalShirts;
		this.colorOfShirt = colorOfShirt;
	}
	public Shirt(String type, boolean quality, Color colorOfShirt) {
		this.brand="LP";
		this.type = type;
		this.quality = quality;
		this.colorOfShirt = colorOfShirt;
	}
	public Shirt(String type, int totalShirts) {
		this.brand="indianTerrain";
		this.type = type;
		this.totalShirts = totalShirts;
	}
	
	
	
	
	

	
	
	
	

}
