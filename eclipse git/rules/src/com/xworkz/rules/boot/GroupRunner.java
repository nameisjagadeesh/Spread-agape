package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.GroupsRules;
import com.xworkz.rules.followers.GroupedPeoples;

public class GroupRunner {

	public static void main(String[] args) {
		GroupedPeoples groupedPeoples = new GroupedPeoples();
		System.out.println(groupedPeoples.attendence());
		System.out.println(groupedPeoples.discipline());
		System.out.println(groupedPeoples.outings());
		System.out.println(groupedPeoples.sports());
		System.out.println(groupedPeoples.plays());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		GroupsRules groupedPeoples2 = new GroupedPeoples();
		System.out.println(groupedPeoples2.attendence());
		System.out.println(groupedPeoples2.discipline());
		System.out.println(groupedPeoples2.outings());
		System.out.println(groupedPeoples2.sports());
		System.out.println(groupedPeoples2.plays());
	}

}
