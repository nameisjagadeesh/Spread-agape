package com.xworkz.data;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupsWordByLength {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("i", "am", "jagadeesh", "from", "bengaluruuu", "and", "thankYou");
		Map<Integer, List<String>> groupsWordByLength = words.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(groupsWordByLength);
	}

}
