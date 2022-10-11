package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer nama =new Developer();
		System.out.println(nama.name);
		nama.name="Jaideep";
		System.out.println(nama.name);
		
		Developer edu =new Developer();
		System.out.println(edu.education);
		edu.education="electric engineer";
		System.out.println(edu.education);
		
		Developer exp =new Developer();
		System.out.println(exp.experience);
		exp.experience=2;
		System.out.println(exp.experience);
		
		Developer sal =new Developer();
		System.out.println(sal.salary);
		sal.salary=6;
		System.out.println(sal.salary);
		
		Developer work =new Developer();
		System.out.println(work.company);
		work.company="Bintech";
		System.out.println(work.company);
		
		
	}
}
