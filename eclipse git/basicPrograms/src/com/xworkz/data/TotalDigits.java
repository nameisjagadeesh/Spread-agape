package com.xworkz.data;

public class TotalDigits {

	public static void main(String[] args) {
		int i = 123456;
		int count = 0;

		while (i > 0) {
			count++;
			i = i / 10;
		}
		
		System.out.println("total number of digits are "+count);
	}

}
