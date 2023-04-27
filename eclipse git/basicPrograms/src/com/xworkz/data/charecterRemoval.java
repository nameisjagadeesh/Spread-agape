package com.xworkz.data;

//Q-remove a from String str="Jagadeesh"
public class charecterRemoval {

	public static void main(String[] args) {
		String str = "Jagadeesh";
		// System.out.println(str.replaceAll("a", "")); --using inbuild methods
		
		char ch='a';
		remove(str, ch);
	}

	// not using inbuild method

	public static void remove(String str, char c) {
	//	int n = str.length();
		String finalStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				finalStr = finalStr + str.charAt(i);
			}
		}
         System.out.println(finalStr);
	}
}
