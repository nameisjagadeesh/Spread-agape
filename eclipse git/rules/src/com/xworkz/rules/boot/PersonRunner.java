package com.xworkz.rules.boot;

import com.xworkz.rules.followers.Jagadeesh;
import com.xworkz.rules.followers.JavaTrainee;
import com.xworkz.rules.followers.Person;
import com.xworkz.rules.ruleMaker.PersonDetails;

public class PersonRunner {

	public static void main(String[] args) {
		// Person person = new Person(); cant create instance as person is abstract

		Person person = new JavaTrainee();
		

		person.setAge(25);
		person.setFirstName("jagadeesh");
		person.setLastName("Allagi");
		person.setSiblings(0);
		person.setWorking(true);

		
		System.out.println(person.getFirstName());
		System.out.println(person.isWorking());
		System.out.println(person.getLastName());
		System.out.println(person.getSiblings());
		System.out.println(person.getAge());
		
		person.eat();
		person.sleep();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		JavaTrainee javaTrainee=new JavaTrainee();
		javaTrainee.setAge(22);
		javaTrainee.setFirstName("jaideep");
		javaTrainee.setLastName("xyz");
		javaTrainee.setSiblings(2);
		javaTrainee.setWorking(false);

		
		System.out.println(javaTrainee.getFirstName());
		System.out.println(javaTrainee.isWorking());
		System.out.println(javaTrainee.getLastName());
		System.out.println(javaTrainee.getSiblings());
		System.out.println(javaTrainee.getAge());
		
		javaTrainee.completedProgram();
		javaTrainee.eat();
		javaTrainee.sleep();
		javaTrainee.training();
		javaTrainee.uploadedTasks("strings");
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		
		Jagadeesh jagadeesh=new Jagadeesh();
		jagadeesh.eat();
		
	//	Person person2=new Jagadeesh();
		
		PersonDetails personDetails=new PersonDetails(jagadeesh);
		personDetails.personCheck();

	}

}
