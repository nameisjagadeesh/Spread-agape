package com.xworkz.copy.boot;
//accessing the copied constuctors and instiation

import com.xworkz.copy.examples.*;

public class BusRunner {

	public static void main(String[] args) {
		Bus no = new Bus();
		System.out.println(no.number);
		Bus dest = new Bus();
		System.out.println(dest.destination);
		Bus source1 = new Bus();
		System.out.println(source1.source);
		no.number = 28;
		System.out.println("the bus number is " + no.number);
		dest.destination = "Bengalururu";
		System.out.println("the destination is :" + dest.destination);
		source1.source = "Hyderabad";
		System.out.println("the source is : " + source1.source);

		no.number = 34;
		System.out.println("the updated bus number is :" + no.number);

	}

}
