package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Light;


public class LightRunner {

	public static void main(String[] args) {
		//here i am calling the methods by passing arguments
		System.out.println("accessing all details by calling the methods");
		short quantity = 65;
		int[] prices = { 150, 183, 326, 658, 325, 156 };
		double[] weighs = { 15.23, 16.1, 20.2, 6.3, 12.3, 9.3 };
		double[] length = { 12.3, 21.1, 22.2, 13.3, 16.3, 33.3 };
		String[] colors = { "white", "black", "halogen", "blue" };
		long[] range = { 56698L, 54662L, 57889L, 36458L, 65486L }; //in hours
		String[] adress = {  "bengaluru", "mumbai", "delhi", "kolkatta"};
		Light light = new Light("havels", 'L',  prices,colors,  weighs, "havelscompany", "LED", quantity, range,
				length,adress);
		light.printDetails();
		
	}

}
