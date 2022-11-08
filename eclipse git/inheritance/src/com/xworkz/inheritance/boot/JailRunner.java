package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Jail;
import com.xworkz.inheritance.things.childclass.CentralJail;
import com.xworkz.inheritance.things.childclass.SubJail;
import com.xworkz.inheritance.things.childclass.WomensJail;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail=new CentralJail();
		System.out.println(jail.location);
		System.out.println(jail.name);
		CentralJail centralJail=(CentralJail) jail;
		System.out.println(centralJail.jailerName);
		System.out.println(centralJail.adress);
		System.out.println("~~~~~~~~~~~~~");
		
		Jail jail2=new WomensJail();
		System.out.println(jail2.location);
		System.out.println(jail2.name);
		WomensJail jail3 = (WomensJail) jail2;
		System.out.println(jail3.jailCode);
		System.out.println(jail3.womenNames);
		System.out.println("~~~~~~~~~~~~~");
		
		Jail jail4=new SubJail();
		System.out.println(jail4.location);
		System.out.println(jail4.name);
		SubJail jail5=(SubJail) jail4;
		System.out.println(jail5.totalSubJails);
		System.out.println(jail5.location);
		
		
		
	}

}
