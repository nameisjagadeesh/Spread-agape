package com.xworkz.data;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Count each characters
public class StringCount {
	public static void main(String[] args) {
		String str = "JAGADEESH ALLAGIFROMBENGALURU";
//		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toUpperCase)
//		.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
//		System.out.println(result);

		Map<String, Long> result = Arrays.stream(str.split("")).map(String::toUpperCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));

		System.out.println(result);
	}
}
