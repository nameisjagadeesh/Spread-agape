package com.xworkz.access.boot;

import com.xworkz.access.things.constructor.Fish;
import com.xworkz.access.things.constructor.JellyFish;

public class JellyFishRunner {

	public static void main(String[] args) {
		JellyFish jellyFish = new JellyFish(); // instantiation

		Fish fish = Fish.create(); // creating the instance of Fish using constructor which was private

		jellyFish.swim(); // invoking the method
		System.out.println(fish.getName()); // allowing runner file to only access but not to modify
		
	}

}
