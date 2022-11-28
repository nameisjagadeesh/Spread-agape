package com.xworkz.rules.boot;

import com.xworkz.rules.followers.PublicCourt;

public class PublicCourtRunner {

	public static void main(String[] args) {
		PublicCourt court = new PublicCourt();
		System.out.println(court.casestudy());
		System.out.println(court.genderEquality(false));
		System.out.println(court.justice(false));
		System.out.println(court.lawyerQualification(null));
		System.out.println(court.timePeriod());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		PublicCourt court2 = new PublicCourt();
		System.out.println(court2.casestudy());
		System.out.println(court2.genderEquality(false));
		System.out.println(court2.justice(false));
		System.out.println(court2.lawyerQualification(null));
		System.out.println(court2.timePeriod());

	}

}
