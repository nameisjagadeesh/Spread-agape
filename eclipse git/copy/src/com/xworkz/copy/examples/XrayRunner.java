package com.xworkz.copy.examples;

import com.xworkz.copy.boot.Xray;

public class XrayRunner {

	public static void main(String[] args) {
		short thickness=6;
		String[] color = { "white", "black", "blue", "silver", "grey" };
		String[] materials = { "plastic", "alluminium", "sheets" };
		int[] pass = { 2,3,1,6,1 };
		double[] weight = { 200,300,653,123,632 };//grams
		int[] quantity = { 150, 40, 50, 30, 99, 90 };
		double[] width = { 6,7,9,6,5 };
		Xray xray=new Xray(materials, 'x', "medical", quantity, color, weight, thickness, "hospitals", true, pass, width);
		xray.testIt();
	}

}
