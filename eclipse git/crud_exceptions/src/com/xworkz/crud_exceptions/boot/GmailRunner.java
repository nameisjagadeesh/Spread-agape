package com.xworkz.crud_exceptions.boot;

import com.xworkz.crud_exceptions.repositories.GmailRepository;
import com.xworkz.crud_exceptions.repositories.GmailRepositoryImpli;

public class GmailRunner {

	public static void main(String[] args) {
		GmailRepository gmailRepository=new GmailRepositoryImpli();
		gmailRepository.create("jvallagi2834@gmail.com");
		gmailRepository.create("allagijagadeesh.xworkz@gmail.com");
		gmailRepository.create("jaideepn.xworkz@gmail.com");
		gmailRepository.create("prashantpatil.xworkz@gmail.com");
		gmailRepository.create("rudersh2@gmail.com");
		gmailRepository.create("jvallagi4@gmail.com");
		gmailRepository.create("cmkarthik@gmail.com");
		gmailRepository.create("manjunath8971@gmail.com");
		gmailRepository.create("akshaypatta@gmail.com");
		gmailRepository.create("jvallagi2834@gmail.com");
		//gmailRepository.create("chetandv@gmail.com");
		System.out.println(gmailRepository.totalGmails());
	}

}
