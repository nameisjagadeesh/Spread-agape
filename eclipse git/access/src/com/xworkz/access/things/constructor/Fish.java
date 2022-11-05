package com.xworkz.access.things.constructor;

public class Fish {
	// this program is on constructor encapsulation
	// class names JellyFish JellyFishRunner
	private String name = "xyz";

	private Fish() {

		//System.out.println("this is constructor which is default");

	}

	public static Fish create() { //method to create instance using constructor
		Fish fish = new Fish();
		fish.name = "starfish";
		Fish fish2 = new Fish();
		fish2.name = "bangda"; //here in this method only one fish ref is returned

		return fish;
	}

	public String getName() { //making method as public so all classes of same and different classes can access 
		return name;
	}

	void setName(String name) { //making default method which means only other classess from same package can be accessed
		this.name = name;
	}

}
