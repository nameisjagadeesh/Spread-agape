package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.BmrclRules;

public class BmrclStafs implements BmrclRules {

	@Override
	public boolean ticketIssue() {
		System.out.println("running the ticketIssue");
		return true;
	}

	@Override
	public int ticketPrice() {
		System.out.println("running the ticketprice");
		return 30;
	}

}
