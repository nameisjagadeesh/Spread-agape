package com.xworkz.data;

//A Fibonacci sequence is one in which each number is the sum of the two previous numbers.
public class PrintFibonacci {

	public static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) {
    	printFibonacciSequence(10);
	}

}
