package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.childclass.Rafel;
import com.xworkz.inheritance.things.childclass.WarJet;

public class WarJetRunner {

	public static void main(String[] args) {

		Rafel rafel = new Rafel(6523664L, "Rafel281", "France");
		rafel.flies();
		rafel.procured();

		WarJet warJet = new WarJet(9565412366L, "rafel652");
		warJet.flies();
		warJet.procured();
	}

}
