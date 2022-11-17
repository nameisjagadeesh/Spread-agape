package com.xworkz.basicPrograms.questions;
// Write a program to count the number of character in the given String without using length() Method.

public class CountOfChar {

	public static void main(String[] args) {
		
		String name = "God is great and great full to him";
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println("Total Count-"+count);

	}

}
