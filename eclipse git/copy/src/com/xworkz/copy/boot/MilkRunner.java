package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		
		Milk milk=new Milk("pastured", false, Color.WHITE);
		milk.totalPackets = 93; // this reference initialisation
		milk.setPrice(45); // this method level initialisation
		milk.displayTotalPrice();
		milk.printmilkDetails();
	}

}
