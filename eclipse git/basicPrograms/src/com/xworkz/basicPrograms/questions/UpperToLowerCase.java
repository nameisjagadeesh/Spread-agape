package com.xworkz.basicPrograms.questions;

import java.util.Scanner;

public class UpperToLowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any String");
		
		String input = sc.nextLine();
		
		char[] word = input.toCharArray();
		
		for(int a=0;a<word.length;a++ )
		{
			if(word[a]>='A'&& word[a]<='Z')
			{
				word[a] = (char)((int)word[a]+32);
			}
			
			
		}
		
		System.out.println("String in lower case is:");
		  for(int a=0;a<word.length;a++)
		  {
			  System.out.println(word[a]);
		  }
		
		   sc.close();
	}

}
