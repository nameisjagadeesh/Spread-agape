package com.xworkz.basicPrograms.questions;

/*
 "Your task is to create a function that does four basic mathematical operations.The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7

 */
public class SwitchCase {

	public static void main(String[] args) {
		int a = 10, b = 5;
		char n = '*'; //changes 
		switch (n) {
		case '+':
			System.out.println("hi hello");

			System.out.println(a + b);
			break;
		case '-':
			System.out.println("hello every one");
			System.out.println(a - b);
			break;
		case '*':
			System.out.println("Hello humans");
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
		}
	}

}
