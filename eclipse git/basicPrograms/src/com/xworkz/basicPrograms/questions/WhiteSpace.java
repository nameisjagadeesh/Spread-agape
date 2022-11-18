package com.xworkz.basicPrograms.questions;
//remove white space
public class WhiteSpace {

	public static void main(String[] args) {
		String name="Hi hello how are you sir";
		name=name.replaceAll("\\s+","");
		System.out.println("All space removed:"+name);
		
	}

}
