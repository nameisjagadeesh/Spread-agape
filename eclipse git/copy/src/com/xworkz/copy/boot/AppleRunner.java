package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Apple;

public class AppleRunner {

	public static void main(String[] args) {
		//here i am calling the methods by passing arguments
		System.out.println("accessing all details by calling the methods");
		short life = 30;
		int[] sale = { 1503, 1836, 3926, 6258, 3625, 1556 };		
		double[] weighs = { 300, 250, 365, 199, 625, 485 };
		double[] width = { 1.3, 2.1, 2.2, 3.3, 6.3, 3.9 };
		String[] colors = { "white", "red", "green",  };
		long[] total = { 695668L, 354662L, 657889L, 396458L, 165486L }; 
		String[] loaction = {  "kashmir", "assam", "coorg", "australia","vegas"};
		Apple apple=new Apple(27.5, "kashmirapple", total, colors, weighs, "medium", "commercial", life, sale, width, loaction);
		apple.eatApple();
	}

}
