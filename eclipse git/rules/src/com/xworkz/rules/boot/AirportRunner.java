package com.xworkz.rules.boot;

import com.xworkz.rules.followers.Pilots;
import com.xworkz.rules.ruleMaker.AirportAuthority;

public class AirportRunner {

	public static void main(String[] args) {
		Pilots pilots = new Pilots();
		AirportAuthority airportAuthority = new AirportAuthority(pilots); //this is abstraction
		airportAuthority.airportCheck();
	}

}
