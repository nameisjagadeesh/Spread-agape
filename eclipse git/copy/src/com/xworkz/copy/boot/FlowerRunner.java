package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
		Flower flower =new Flower("gardening", false, Color.WHITE);
		flower.totalCount = 30; // this reference initialisation
		flower.setBox(23); // this method level initialisation
		flower.displayTotalFlowers();
		flower.feelFLower();
	}

}
