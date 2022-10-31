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
		Company comp = new Company("bosch", "shankar");
		Nation nation = new Nation("india", "Dehali", 332000, +91);
		MetroCity city = new MetroCity("hyderbad", 3320000, 445698, "tree City");
		State state = new State("telangana state", "kcr", 62, "hydreabad");
		Location locate = new Location(236, "12th cross Road");
		locate.setCity(city, state, nation);
		comp.setLocation(locate);
		job.setCompany(comp);
		pet.setJob(job);
		Email  email1=new Email("shankar.boshc@gmail.com","@bstractClass",3264478966L);
		email1.setCompany(comp);
		Email  email2=new Email("reddy@gmail.com","@123",96587456321L);
		email2.setCompany(comp);
		Email  email3=new Email("kinto@gmail.com","@678",856963214L);
		email3.setCompany(comp);
		Email  email4=new Email("dellsa@gmail.com","@9900",8569741123L);
		email4.setCompany(comp);
		Email[] strong= {email1,email2,email3,email4};
		pet.setEmails(strong);
		pet.display();
	}

}
