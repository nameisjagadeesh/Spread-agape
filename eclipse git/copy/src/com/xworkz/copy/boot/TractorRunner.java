package com.xworkz.copy.boot;
//runner file of tractor constructor chaining ,created instance using all constructor

import com.xworkz.copy.examples.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		System.out.println("constructor chaining ");
		Tractor tractor=new Tractor("Arjun");
		System.out.println(tractor.name);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name and price");
		Tractor track=new Tractor("kinac", 954621L);
		System.out.println(track.name);
		System.out.println(track.price);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name , brandand price===");
		Tractor runs=new Tractor("kirlosar", 8546985L, "yamaha");
		System.out.println(runs.name);
		System.out.println(runs.price);
		System.out.println(runs.brand);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name , brand ,weight and price===");
		Tractor tractor2=new Tractor("swaraj", 458769L, "mahindra", 12.55);
		System.out.println(tractor2.name);
		System.out.println(tractor2.price);
		System.out.println(tractor2.brand);
		System.out.println(tractor2.weight);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining name , brand ,weigh,modelt and price===");
		Tractor tractor3=new Tractor("deere", 458796L, "mahindra", 14563, 'b');
		System.out.println(tractor3.name);
		System.out.println(tractor3.price);
		System.out.println(tractor3.brand);
		System.out.println(tractor3.weight);
		System.out.println(tractor3.model);
		
		System.out.println(System.lineSeparator());
		System.out.println("====chaining weight and price===");
		Tractor tractor4=new Tractor(845697L, 6541);
		System.out.println(tractor4.price);
		System.out.println(tractor4.weight);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
