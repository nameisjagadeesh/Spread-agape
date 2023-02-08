package com.xworkz.data;

import java.util.Iterator;

//int[] array = { 11, 12, 13, 16, 21, 26, 20 }; here first print even then odd

public class EvenFirstOddNext {

	public static void main(String[] args) {

		int[] arr = { 11, 12, 13, 16, 21, 26, 20, 32 };
		evenOdd(arr);
	}

	public static void evenOdd(int[] arr) {

		// to print even first
		int[] a = new int[arr.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (arr[i] % 2 == 0) {
				a[index] = arr[i];
				index++;
			}

		}
		// to print odd next
		for (int i = 0; i < a.length; i++) {
			if (arr[i] % 2 != 0) {
				a[index] = arr[i];
				index++;
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}

	}
}
