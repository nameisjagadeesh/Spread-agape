package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Headphone;

public class HeadphoneRunner {

	public static void main(String[] args) {
		short accessories=6;
		String[] color = { "white", "black", "blue", "silver", "grey" };
		String[] producer = { "sony", "apple", "realme", "mi",  };
		int[] warranty = { 2,3,1,6,1 };
		double[] weight = { 200,300,653,123,632 };//grams
		int[] price = { 1530, 4000, 6550, 3650, 8099, 9990 };
		double[] parts = { 6,7,9,6,5 };
		Headphone headphone=new Headphone("apple", 'H', "overhead", price, color, weight, accessories, producer, true, warranty, parts);
		headphone.hearit();
	}

}
