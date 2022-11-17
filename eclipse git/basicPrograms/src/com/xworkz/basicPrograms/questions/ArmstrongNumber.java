package com.xworkz.basicPrograms.questions;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n=263,rev=0,run,sum=0;
		for(;n!=0;n=n/10) {
			run=n%10;
			int temp=run*run*run;
			rev++;
			sum=sum+temp;
			System.out.println(temp);
			System.out.println("sum is"+sum);
			System.out.println("count"+rev);
			
		}
	}

}
