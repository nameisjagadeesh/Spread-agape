package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Window;

public class WindowRunner {

	public static void main(String[] args) {
		short thickness=6;
		String[] color = { "white", "black", "blue", "silver", "grey" };
		String[] materials = { "wood", "plywood", "sheets" };
		int[] bolts = { 2,3,1,6,1 };
		double[] weight = { 20,30,53,23,62 };//kg
		int[] quantity = { 150, 40, 50, 30, 99, 90 };
		double[] width = { 6,7,9,6,5 };
		
		Window window=new Window(materials, 'L', "homedoor", quantity, color, weight, thickness, "hall", false, bolts, width);
		window.windowSlide();
	}

}
