package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.ForestRules;
import com.xworkz.rules.followers.ForestVisitors;

public class ForestRunner {

	public static void main(String[] args) {
		ForestVisitors forestVisitors = new ForestVisitors();
		System.out.println(forestVisitors.entryLimit());
		System.out.println(forestVisitors.plasticBan());
		System.out.println(forestVisitors.restriction());
		System.out.println(forestVisitors.safety());
		System.out.println(forestVisitors.tribalsPart());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ForestRules forestVisitors2 = new ForestVisitors();
		System.out.println(forestVisitors2.entryLimit());
		System.out.println(forestVisitors2.plasticBan());
		System.out.println(forestVisitors2.restriction());
		System.out.println(forestVisitors2.safety());
		System.out.println(forestVisitors2.tribalsPart());
	}

}
