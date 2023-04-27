package com.xworkz.data.team;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PateintGroupRunner {

	public static void main(String[] args) {
		PateintGroup p1 = new PateintGroup("jag", 27, "fever", "12345");
		PateintGroup p2 = new PateintGroup("hari", 26, "tb", "52365");
		PateintGroup p3 = new PateintGroup("kim", 25, "fever", "8745");
		PateintGroup p4 = new PateintGroup("jhon", 23, "corona", "9856");

		List<PateintGroup> patients = Arrays.asList(p1, p2, p3, p4);

		patients.stream().filter(p -> p.getType().equals("fever") && p.getAge() > 24).forEach(System.out::println);

		Double avg = patients.stream().filter(p -> p.getType().equals("fever"))
				.collect(Collectors.averagingInt(PateintGroup::getAge));
		System.out.println("avg age is" + avg);
	}

}
