package com.xworkz.access.boot;

import com.xworkz.access.things.Shirt;

import com.xworkz.access.things.SweatShirt;

public class ShirtRunner {

	public static void main(String[] args) {
		Shirt shirt=new Shirt();
		SweatShirt sweatShirt=new SweatShirt("roadpro", "string", true, "country", 'I', "jagadeesh", "roadster company", 6654123L);
			
		System.out.println(shirt.name);
		System.out.println(shirt.sweatShirt);
		System.out.println(sweatShirt.getBrand());
		System.out.println(sweatShirt.getPrice());
		System.out.println(sweatShirt.getQuantity());
		
		shirt.wearIt();
		
	}

}
