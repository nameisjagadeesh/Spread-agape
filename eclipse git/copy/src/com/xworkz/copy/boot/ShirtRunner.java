package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Color;
import com.xworkz.copy.examples.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt = new Shirt("trends"); // here trends as brand name is final for this constrcto
		System.out.println(shirt.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Shirt shirt2 = new Shirt("casual", 15);
		System.out.println(shirt2.brand); // here indian terrn as brand name is final for this constrctor

		System.out.println(shirt2.type);
		System.out.println(shirt2.totalShirts);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Shirt shirt3 = new Shirt("sport", true, Color.BLACK);
		System.out.println(shirt3.brand);
		System.out.println(shirt3.type);
		System.out.println(shirt3.quality);
		System.out.println(shirt3.colorOfShirt);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Shirt shirt4=new Shirt("formal", 1650, true, 20, Color.WHITE);
		System.out.println(shirt4.brand);
		System.out.println(shirt4.type);
		System.out.println(shirt4.quality);
		System.out.println(shirt4.colorOfShirt);
		System.out.println(shirt4.price);
		System.out.println(shirt4.totalShirts);
		
		
				

	}

}
