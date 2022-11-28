package com.xworkz.rules.bridge;

public interface PgRules {
	boolean payment(int price);

	boolean membersAllowed(int members);

	boolean security(String name);

	boolean cityLimit();

	boolean restriction();

}
