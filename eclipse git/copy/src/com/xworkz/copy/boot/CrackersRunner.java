package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Crackers;

public class CrackersRunner {

	public static void main(String[] args) {
		Crackers crackers = new Crackers("Nandi crackers", true, Color.GREY);
		crackers.totalCount = 24; // this reference initialisation
		crackers.setPrice(350); // this method level initialisation
		crackers.displayTotalPrice();
		crackers.blastCrackers();
	}

}
