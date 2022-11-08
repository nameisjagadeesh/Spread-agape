package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Dowry;
import com.xworkz.inheritance.things.childclass.MarriageDowry;

public class DowryRunner {

	public static void main(String[] args) {
		Dowry dowry=new MarriageDowry("Ramesh", 6597446L, false);
		
		System.out.println(dowry.dowryMoney);
		System.out.println(dowry.legality);
		System.out.println(dowry.recipientName);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		MarriageDowry dowry2=new MarriageDowry("Bhim", 2690156L, false);
		System.out.println(dowry2.dowryMoney);
		System.out.println(dowry2.legality);
		System.out.println(dowry2.recipientName);
	}

}
