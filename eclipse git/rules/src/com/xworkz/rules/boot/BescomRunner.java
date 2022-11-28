package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.BescomRules;
import com.xworkz.rules.followers.BescomUsers;

public class BescomRunner {

	public static void main(String[] args) {
		BescomUsers bescomUsers = new BescomUsers();
		System.out.println(bescomUsers.deadlines(null));
		System.out.println(bescomUsers.overloading(0));
		System.out.println(bescomUsers.priceList(0));
		System.out.println(bescomUsers.taxes(0));
		System.out.println(bescomUsers.unitLimit(0));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		BescomRules bescomUsers2 = new BescomUsers();
		System.out.println(bescomUsers2.deadlines(null));
		System.out.println(bescomUsers2.overloading(0));
		System.out.println(bescomUsers2.priceList(0));
		System.out.println(bescomUsers2.taxes(0));
		System.out.println(bescomUsers2.unitLimit(0));

	}

}
