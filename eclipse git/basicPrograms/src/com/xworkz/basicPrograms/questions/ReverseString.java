package com.xworkz.basicPrograms.questions;

import java.util.Scanner;
//reverse a given String
//here the reversing will happen in sop consol page

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter value");
		int val=1;
		while(val>0) {
			String name=scr.next();
			String rev=" ";
			int length=name.length();
			for(int i=length-1;i>=0;i--) {
				rev=rev+name.charAt(i);
			}
			System.out.println(rev);
		}
	}

}
