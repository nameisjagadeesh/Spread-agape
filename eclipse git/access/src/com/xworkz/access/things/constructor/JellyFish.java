package com.xworkz.access.things.constructor;

public class JellyFish {
	public String type = "ocean";
	public Fish fish = Fish.create(); //this initialising the Fish variable by method name

	public void swim() {
		System.out.println(this.type);
		if (this.fish != null) {
			//this.fish = Fish.create(); //this allows jellyfish class to access and modify

			//Fish fish = Fish.create();

			System.out.println(fish.getName());
			fish.setName("anjal");
			System.out.println("updated fish name is   :" + fish.getName());
			
		} else {
			System.out.println("fish is null");
		}

	}

}
