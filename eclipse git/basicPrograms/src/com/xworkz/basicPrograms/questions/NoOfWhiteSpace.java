package com.xworkz.basicPrograms.questions;

import java.util.Scanner;

public class NoOfWhiteSpace {
	public static void main(String[] args) {
		String str = "i am jagadeesh allagi from Xworkz";
		int count = 0;
		String s = "" ; //,newName = ""
		String str1[]=str.split(" ") ;
		@SuppressWarnings("resource")
		Scanner sp=new Scanner(System.in);
		String rev=sp.next();
		for (char ch : str.toCharArray()) {
			if (ch == ' ') {
				count++; // or count+=1 ===count=count+1

			} else {
				s += ch; // s=s=ch

			}
//           if(count>2&& count<=3) {
//        	   newName=ch+newName;
//           }
		}
		System.out.println("no of spaces/white spaces:" + count); // sop should be given outside the loop
		System.out.println("string without space :" + s);
		//System.out.println("reversed   :"+newName);
		for(int i=0; i<str1.length ; i++) {
			if(str1[i].equals(rev)) {
				char ch[]=rev.toCharArray();
				for(int j=ch.length-1;j>=0;j--) {
					s=s+ch[j];
				}
				
			}
			
		}
		for(int i=0;i<str1.length;i++) {
			if(str1[i].equals(rev)) {
				str1[i]=s;
			}
			
		}
		for(int i=0;i<str1.length;i++) {
			System.out.print(str1[i]+" ");
		}
	}

}

