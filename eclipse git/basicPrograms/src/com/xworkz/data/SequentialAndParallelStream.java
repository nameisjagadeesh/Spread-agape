package com.xworkz.data;

import java.util.Arrays;
import java.util.List;

public class SequentialAndParallelStream {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		// this is sequesntial stream by default and output is predictable
		num.stream().forEach(e -> {
			System.out.println(e + " in " + Thread.currentThread().getName());
		});

		System.out.println("~~~~~~~~~~");

		//this is paralell stream ,output is not predictable
		num.parallelStream().forEach(e -> {
			System.out.println(e + " in " + Thread.currentThread().getName());
		});
	}

}
