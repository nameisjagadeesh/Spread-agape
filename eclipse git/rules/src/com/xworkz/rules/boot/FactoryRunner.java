package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.FactoryRule;
import com.xworkz.rules.followers.FactoryStaffs;

public class FactoryRunner {

	public static void main(String[] args) {
		FactoryRule factoryRule = new FactoryStaffs();
		System.out.println(factoryRule.branches());
		System.out.println(factoryRule.members());
		System.out.println(factoryRule.outlets());
		System.out.println(factoryRule.vehicles());
		System.out.println(factoryRule.workers());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		FactoryStaffs factoryRule2= new FactoryStaffs();
		System.out.println(factoryRule2.branches());
		System.out.println(factoryRule2.members());
		System.out.println(factoryRule2.outlets());
		System.out.println(factoryRule2.vehicles());
		System.out.println(factoryRule2.workers());
	}

}
