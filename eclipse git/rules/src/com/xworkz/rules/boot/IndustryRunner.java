package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.IndustryRules;
import com.xworkz.rules.followers.IndustryEmployess;

public class IndustryRunner {

	public static void main(String[] args) {
		IndustryRules industryRules = new IndustryEmployess();
		System.out.println(industryRules.exitTime(0));
		System.out.println(industryRules.onTime(0));
		System.out.println(industryRules.perfomance());
		System.out.println(industryRules.targets(null));
		System.out.println(industryRules.tasks());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		IndustryEmployess industryRules2 = new IndustryEmployess();
		System.out.println(industryRules2.exitTime(0));
		System.out.println(industryRules2.onTime(0));
		System.out.println(industryRules2.perfomance());
		System.out.println(industryRules2.targets(null));
		System.out.println(industryRules2.tasks());

	}

}
