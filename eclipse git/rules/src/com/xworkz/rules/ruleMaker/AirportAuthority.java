package com.xworkz.rules.ruleMaker;

import com.xworkz.rules.bridge.AirportRules;

public class AirportAuthority {
	private AirportRules airportRules;

	public AirportAuthority(AirportRules airportRules) {
		this.airportRules = airportRules;
	}

	public void airportCheck() {
		System.out.println("running the airport check");
		if (this.airportRules != null) {
			boolean takeOff = this.airportRules.onTimeTakeOff();
			double capacity = this.airportRules.staffCapacity();
			if (takeOff && capacity >= 15) {
				System.out.println("airport is following the rules");
			} else {
				System.err.println("airport is not following the rules");
			}
		}
	}

}
