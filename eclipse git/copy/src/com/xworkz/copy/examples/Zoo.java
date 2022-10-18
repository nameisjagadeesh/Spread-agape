package com.xworkz.copy.examples;
//here i declared the methods to access all details


public class Zoo {
	public String name;
	public String[] animals;
	public long totalWildLife;
	public double area;
	public String location;
	
	public Zoo(String name,String[] animals,long totalWildLife,double area,String location) {
		this.name=name;
		this.animals=animals;
		this.totalWildLife=totalWildLife;
		this.area=area;
		this.location=location;
				
	}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.animals);
		System.out.println(this.totalWildLife);
		System.out.println(this.area);
		System.out.println(this.location);
		for (int i = 0; i < animals.length; i++) {
			String string = animals[i];
			System.out.println(string);
			
		}
	}

}
