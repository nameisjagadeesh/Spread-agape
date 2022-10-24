package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Lamp;

public class LampRunner {

	public static void main(String[] args) {
		Lamp lamp = new Lamp("night", true, Color.RED);
		lamp.totalLamps = 63; // this reference initialisation
		lamp.setPrice(65); // this method level initialisation
		lamp.displayTotalPrice();
		lamp.spredLight();
	}

}
