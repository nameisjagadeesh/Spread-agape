package com.xworkz.association.things.person;
//this is on one to one and one to many relation program
public class Person {
	public String name;
	public Email[] emails;
	public Job job;

	public Person(String name) {//constrctor initalisation
		this.name = name;
	}

	public void setEmails(Email[] emails) {//method initalisation
		this.emails = emails;
	}

	public void setJob(Job job) {//method initalisation
		this.job = job;
	}

	public void display() {
		System.out.println("Name of Person:" + name);
		if (this.emails != null) {
			for (int i = 0; i < emails.length; i++) {
				Email element = this.emails[i];
				
				if (element != null) {
					element.show();
				} else {
					System.out.println("element is null");
				}
			}
		} else {
			System.out.println("Email is null");

		}
		if (this.job != null) {
			this.job.show();
		}

	}

}
