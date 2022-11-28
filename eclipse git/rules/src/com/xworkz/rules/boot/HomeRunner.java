package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.HomeRules;
import com.xworkz.rules.followers.Family;

public class HomeRunner {

	public static void main(String[] args) {
		Family family = new Family();
		System.out.println(family.activites(0));
		System.out.println(family.limits());
		System.out.println(family.participation(null));
		System.out.println(family.responsibilities(null));
		System.out.println(family.respectFull());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		HomeRules family2 = new Family();
		System.out.println(family2.activites(0));
		System.out.println(family2.limits());
		System.out.println(family2.participation(null));
		System.out.println(family2.responsibilities(null));
		System.out.println(family2.respectFull());
	}

}
