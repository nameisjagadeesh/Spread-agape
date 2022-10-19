package com.xworkz.copy.examples;//8th
//here i declared the instance methods to access all details

public class River {
	public String name;
	public float length;
	public String origin;
	public byte tributaries;
	public short places;
	public String[] localName;
	public String[] country;
	public String[] state;
	public String[] animal;
	public String[] plant;
	public String[] stone;
	
	public River(String name,float length,String origin,byte tributaries,short places,String[] localName,String[] country,String[] state,String[] animal,String[] plant,String[] stone) {
		this.name=name;
		this.length=length;
		this.origin=origin;
		this.tributaries=tributaries;
		this.places=places;
		this.localName=localName;
		this.country=country;
		this.state=state;
		this.animal=animal;
		this.plant=plant;
		this.stone=stone;
	}
	
	public void displayDetails() {
		System.out.println("name : "+this.name);
		System.out.println("length : "+this.length);
		System.out.println("origin : "+this.origin);
		System.out.println("tributaries : "+this.tributaries);
		System.out.println("places : "+this.places);
		System.out.println("local name : "+this.localName);
		System.out.println("country : "+this.country);
		System.out.println("state : "+this.state);
		System.out.println("animal : "+this.animal);
		System.out.println("plant : "+this.plant);
		System.out.println("stone : "+this.stone);
		
		for (int i = 0; i < this.localName.length; i++) {
			String string = this.localName[i];
			System.out.println("local name : "+string);
		}
		for (int i = 0; i < this.country.length; i++) {
			String string = this.country[i];
			System.out.println("country : "+string);
		}
		for (int i = 0; i < this.state.length; i++) {
			String string = this.state[i];
			System.out.println("state : "+string);
		}
		for (int i = 0; i < this.animal.length; i++) {
			String string = animal[i];
			System.out.println("animal : "+string);
		}
		for (int i = 0; i < this.plant.length; i++) {
			String string = this.plant[i];
			System.out.println("plant : "+string);
		}
		for (int i = 0; i < this.stone.length; i++) {
			String string = this.stone[i];
			System.out.println("stone : "+string);
		}
		
	}

}
