package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamMethodRunner {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<String>();
		collection.add("jagadeesh");
		collection.add("jaideep");
		collection.add("manjunath");
		collection.add("kia");
		collection.add("mango");

		collection.stream().filter(e -> e.contains("h")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~~~~");
		collection.stream()
		.map(e -> e.toUpperCase())
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
		collection.stream().collect(Collectors.toList()).forEach(e-> System.out.println(e.length()));
		System.out.println("~~~~~~~~~>~~~~~~~~~~~");
		collection.stream().filter(e-> e.endsWith("h")).collect(Collectors.toList()).forEach(e-> System.out.println(e));
		collection.stream().filter(e->e.startsWith("j")).map(e->e.toUpperCase()).collect(Collectors.toList()).forEach(e-> System.out.println(""+e));

	

	}

}
