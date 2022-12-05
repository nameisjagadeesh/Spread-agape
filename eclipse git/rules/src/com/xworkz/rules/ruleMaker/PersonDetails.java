package com.xworkz.rules.ruleMaker;

import com.xworkz.rules.bridge.KarnatakaRTO;

public class PersonDetails {

	private KarnatakaRTO karnatakaRTO;

	public PersonDetails(KarnatakaRTO karnatakaRTO) {
		System.out.println("default constructor of person details");
	}

	public void personCheck() {
		System.out.println("running person check");
		if (this.karnatakaRTO != null) {
			double tax = this.karnatakaRTO.vat();
			boolean paid = this.karnatakaRTO.paidTax();
			double gst = this.karnatakaRTO.gst();
			if (tax == 2.6 && paid && gst == 6.3) {
				System.out.println("person is following govt rules");
			} else {
				System.err.println("person is not following the rules");
			}

		}
	}

}
