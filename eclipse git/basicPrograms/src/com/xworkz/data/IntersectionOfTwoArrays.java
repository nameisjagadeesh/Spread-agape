package com.xworkz.data;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

	// intersection means printing the common numbers from two arrays
	public static void main(String[] args) {

		int[] firstArray = { 1, 6, 2, 8, 4 };
		int[] secondArray = { 3, 6, 7, 9, 4 };

		Arrays.stream(firstArray).filter(x -> Arrays.stream(secondArray).anyMatch(y -> y == x)).distinct()
				.forEach(System.out::println);

	}

}
