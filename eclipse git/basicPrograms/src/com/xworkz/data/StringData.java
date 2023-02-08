package com.xworkz.data;

public class StringData {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="ABC";  //here data is stored in constant pool
		String str3=new String("aBC"); //here stored in instance memory
		
		System.out.println(str1==str2); //true
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); // false it will check content
		System.out.println(str1.equalsIgnoreCase(str3)); // false it will check content



	}

}
