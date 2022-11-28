package com.xworkz.rules.bridge;

public interface CourtRules {
	boolean genderEquality(boolean sure);

	boolean justice(boolean admitted);

	boolean lawyerQualification(String degree);

	boolean timePeriod();

	boolean casestudy();

}
