package com.xworkz.basicPrograms.questions;

public class PerticularPalindrome {

	public static int check(int num) {
		int temp;
		int temp1 = num;
		int rev = 0;

		while (num != 0) {
			temp = num % 10;
			rev = (rev * 10) + temp;
			num = num / 10;
		}

		if (temp1 == rev) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		int num = 25365;
		int num1 = num, num2 = num;
		int dummy, dummy1;

		while (check(num) == 0) {
			num = num - 1;
		}
		dummy = num2 - num;

		while (check(num1) == 0) {
			num1 = num1 + 1;
		}

		dummy1 = num1 - num2;

		if (dummy1 > dummy) {
			System.out.println("nearest palindrome is =" + num);
		} else {
			System.out.println(num1);
		}
	}

}
