package com.xworkz.basicPrograms.questions;
//Given an array of integers, return a new array with each value doubled.
//For example:
//[1, 2, 3] --> [2, 4, 6]

public class arrayInt {

	public static void main(String[] args) {
	
		int[] arry1 = { 2, 4, 6 };
		for (int i = 0; i < arry1.length; i++) {
			int ref = arry1[i];
			//System.out.println(ref);
			System.out.println(ref * 2);
		}
		// ref*2
	}

}
