package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.PgRules;
import com.xworkz.rules.followers.PgStayers;

public class PgRunner {

	public static void main(String[] args) {
		PgStayers pgStayers = new PgStayers();
		System.out.println(pgStayers.cityLimit());
		System.out.println(pgStayers.membersAllowed(0));
		System.out.println(pgStayers.security(null));
		System.out.println(pgStayers.payment(0));
		System.out.println(pgStayers.restriction());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		PgRules pgStayers1 = new PgStayers();
		System.out.println(pgStayers1.cityLimit());
		System.out.println(pgStayers1.membersAllowed(0));
		System.out.println(pgStayers1.security(null));
		System.out.println(pgStayers1.payment(0));
		System.out.println(pgStayers1.restriction());

	}

}
