package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Saloon;

public class SaloonRunner {

	public static void main(String[] args) {
		Saloon saloon = new Saloon("stylepro", true, Color.BLACK);
		saloon.totalCustomers = 4; // this reference initialisation
		saloon.setPrice(160); // this method level initialisation
		saloon.displayTotalPrice();
		saloon.haircut();
	}

}
