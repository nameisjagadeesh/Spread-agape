package com.xworkz.association.boot;

import com.xworkz.association.things.person.Company;
import com.xworkz.association.things.person.Email;
import com.xworkz.association.things.person.Job;
import com.xworkz.association.things.person.Location;
import com.xworkz.association.things.person.MetroCity;
import com.xworkz.association.things.person.Nation;
import com.xworkz.association.things.person.Person;
import com.xworkz.association.things.person.State;

public class PersonRunner {

	public static void main(String[] args) {
		Person pet = new Person("Pradeep");
		Job job = new Job(100000, "Software", 2);
		Company comp = new Company("Xworkz", "Omsir");
		Nation nation = new Nation("Bharath", "Dehali", 1300000, +91);
		MetroCity city = new MetroCity("Banglore", 1000000, 585600, "Silican City");
		State state = new State("Karnataka", "Basavaraj.S.Bommai", 58, "Bangluru");
		Location locate = new Location(185, "6th main Road");
		locate.setCity(city, state, nation);
		comp.setLocation(locate);
		job.setCompany(comp);
		pet.setJob(job);
		Email  email1=new Email("Xworkz@gmail.com","@bstractClass",8888888888L);
		email1.setCompany(comp);
		Email  email2=new Email("Pradeep@gmail.com","@1234",5555555555L);
		email2.setCompany(comp);
		Email  email3=new Email("wings@gmail.com","@5678",9999999999L);
		email3.setCompany(comp);
		Email  email4=new Email("hp@gmail.com","@910000",6666666666L);
		email4.setCompany(comp);
		Email[] strong= {email1,email2,email3,email4};
		pet.setEmails(strong);
		pet.display();
	}

}
