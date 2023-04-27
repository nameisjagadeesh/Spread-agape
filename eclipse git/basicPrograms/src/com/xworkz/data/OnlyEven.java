package com.xworkz.data;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OnlyEven {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(12, 13,12, 15, 16, 26,26, 24, 17,17);
	number.stream().filter(p -> p % 2 == 0).forEach(System.out::println); // to print only even
		System.out.println("~~~~~~~~~");

		Set<Integer> set = new HashSet<Integer>();
		number.stream().filter(p -> !set.add(p)).forEach(System.out::println);
		
		System.out.println("~~~~~~~~~");
		number.stream().sorted(Collections.reverseOrder()).forEach(System.out::println); //to print in reverse order
	}

}
