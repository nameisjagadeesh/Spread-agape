package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Court;
import com.xworkz.inheritance.things.childclass.DistCourt;
import com.xworkz.inheritance.things.childclass.HighCourt;
import com.xworkz.inheritance.things.childclass.SupremeCourt;

public class CourtRunner {
	public static void main(String[] args) {
		SupremeCourt ref = new SupremeCourt();
		System.out.println(ref.name);
		System.out.println(ref.staff);
		System.out.println(ref.areaInSquareMts);
		System.out.println(ref.location);
		System.out.println("~~~~~~~~~~~~~");

		Court court = new SupremeCourt();
		System.out.println(court.name);
		System.out.println(court.staff);
		SupremeCourt court2 = (SupremeCourt) court; // this casting
		System.out.println(court2.areaInSquareMts);
		System.out.println(court2.location);
		System.out.println("~~~~~~~~~~~~~");

		Court court3 = new HighCourt();
		System.out.println(court3.name);
		System.out.println(court3.staff);
		HighCourt court4 = (HighCourt) court3; // this casting
		System.out.println(court4.judgeName);
		System.out.println(court4.state);
		System.out.println("~~~~~~~~~~~~~");

		Court court5 = new DistCourt();
		System.out.println(court5.name);
		System.out.println(court5.staff);
		DistCourt court6 = (DistCourt) court5; // this casting
		System.out.println(court6.totalCases);
		System.out.println(court6.advocateName);

	}

}
