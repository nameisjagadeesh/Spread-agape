package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Sweet;

public class SweetRunner {
	public static void main(String[] args) {

		Sweet sweet = new Sweet("mysore pak", Color.YELLOW);
		sweet.quantity = 51; // this reference initialisation
		sweet.setPrice(160);// this method level initialisation
		sweet.displayTotalPrice();
		sweet.taste = true; // this reference initialisation
		sweet.eatSweets();

	}

}
