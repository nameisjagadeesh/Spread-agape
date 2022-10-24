package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Mango;

public class MangoRunner {

	public static void main(String[] args) {
		Mango mango=new Mango("india", true, Color.YELLOW);
		mango.quantity = 133; // this reference initialisation
		mango.setPrice(28); // this method level initialisation
		mango.displayTotalPrice();
		mango.printMangoDetails();
	}

}
