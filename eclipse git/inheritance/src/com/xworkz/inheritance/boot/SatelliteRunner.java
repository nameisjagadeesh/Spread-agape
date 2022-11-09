package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Satellite;
import com.xworkz.inheritance.things.childclass.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		Satellite satellite=new Moon("moon", "milkiway", 28);
		satellite.revolve();
		Moon moon=new Moon("pluto", "universe", 360);
		moon.revolve();
	}

}
