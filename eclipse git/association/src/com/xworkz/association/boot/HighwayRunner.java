package com.xworkz.association.boot;

import com.xworkz.association.things.person.Highway;

public class HighwayRunner {

	public static void main(String[] args) {
		Highway highway=new Highway("national highway", 4, null);
	    Road road=new Road("mg road", 60, 7.5, true);
	}

}
