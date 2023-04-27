package com.xworkz.data;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9, 10 };

		int sum = (10 * 11) / 2;

		int actualSum = 0;

		for (int i = 0; i < arr.length; i++) {

			actualSum = actualSum + arr[i];
		}
		System.out.println("missing number is " + (sum - actualSum));
	}

}
