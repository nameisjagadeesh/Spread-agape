package com.xworkz.basicPrograms.questions;
/*
 "Jack really likes his number five: the trick here is that you have to multiply each number by 5 raised to the number of digits of each numbers, so, for example:
multiply(3)==15 // 3 * 5�
multiply(10)==250 // 10 * 5�
multiply(200)==25000 // 200 * 5�
multiply(0)==0�//�0�*�5�"
 */

public class MultipleDouble {

	public static void main(String[] args) {
		int num = 200, count = 0, temp, n;
		n = num;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		System.out.println(count);
		temp = (int) Math.pow(5, count);
		System.out.println(temp);
		int b = temp * num;
		System.out.println(b);
	}

}
