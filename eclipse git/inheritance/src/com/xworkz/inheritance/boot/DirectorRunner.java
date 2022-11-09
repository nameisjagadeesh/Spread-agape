package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Director;
import com.xworkz.inheritance.things.childclass.Prashant;

public class DirectorRunner {

	public static void main(String[] args) {
		Director director = new Prashant("movie", "sandalwood", 32);
		director.direct();
		System.out.println("~~~~~~~~~~~");
		
		Prashant prashant=new Prashant("bank", "sbi", 40);
		prashant.direct();
		System.out.println("~~~~~~~~~~~");
		
		
	}

}
