package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.AirportRules;

public class Pilots implements AirportRules {

	@Override
	public boolean onTimeTakeOff() {
		System.out.println("running the ontimetakeoff");
		return false;
	}

	@Override
	public double staffCapacity() {
		System.out.println("running the staffcapacity");
		return 0;
	}

}
