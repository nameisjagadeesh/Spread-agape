package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		Laptop laptop;
		System.out.println("above i declared the Laptop contrucor");
		short quantity = 3;// here quantity is expicitly initiated

		laptop = new Laptop(65235L, 5.6, "portable", quantity);
		System.out.println(laptop.price);
		System.out.println(laptop.weight);
		System.out.println(laptop.type);
		System.out.println(quantity); //
		System.out.println("====================");

		System.out.println(Laptop.brand); // this recommended to use class name to access the brand
		System.out.println(laptop.brand);// this is not correct way thats why it show warning though it is compiling

		System.out.println("====================");
		
		Laptop.brand = "HP"; // brand has updated n latest value will be printed
		System.out.println(Laptop.brand);
		short quantity2 = 6;
		Laptop laptop2 = new Laptop(45236L, 6.3, "tinymob", quantity2);
		System.out.println("====================");
		System.out.println(laptop2.price);
		System.out.println(laptop2.weight);
		System.out.println(laptop2.type);
		System.out.println(quantity2);// here qunatity is initialisd explicitly

	}

}
