package com.xworkz.rules.ruleMaker;

import com.xworkz.rules.bridge.BmrclRules;

public class BmrclManagement {

	private BmrclRules bmrcl;

	public BmrclManagement() {
		System.out.println("running the bmrcl management default constructor");
	}

	public BmrclManagement(BmrclRules bmrcl) {
		this.bmrcl = bmrcl;
	}

	public void bmrclTrain() {
		if (this.bmrcl != null) {
			System.out.println("running the bmrcltrain");
			boolean issue = this.bmrcl.ticketIssue();
			int price = this.bmrcl.ticketPrice();
			if (issue == true && price >= 10) {
				System.out.println("bmrcl is following the rules");
			} else {
				System.out.println("bmrcl is not following the rules");
			}

		}
	}

}
