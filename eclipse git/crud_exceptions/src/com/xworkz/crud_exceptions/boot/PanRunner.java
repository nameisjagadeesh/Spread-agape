package com.xworkz.crud_exceptions.boot;

import com.xworkz.crud_exceptions.repositories.PanCardRepository;
import com.xworkz.crud_exceptions.repositories.PanCardRepositoryImpli;

public class PanRunner {

	public static void main(String[] args) {
		PanCardRepository cardRepository = new PanCardRepositoryImpli();
		cardRepository.linking("BNGPA1807H");
		cardRepository.linking("BNGPA2507H");
		cardRepository.linking("BNGPA0567H");
		cardRepository.linking("BNGPA1817H");
		cardRepository.linking("BNGPA1387H");
		cardRepository.linking("BNGPA6527H");
		cardRepository.linking("BNGPA4257H");
		cardRepository.linking("BNGPA1357H");
		cardRepository.linking("BNGPA2657H");
		cardRepository.linking("BNGPA6457H");
	    cardRepository.linking("BNGPA6457H");

		System.out.println(cardRepository.total());

	}

}
