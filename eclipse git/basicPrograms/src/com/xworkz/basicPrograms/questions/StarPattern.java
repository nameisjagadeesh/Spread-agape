package com.xworkz.basicPrograms.questions;

public class StarPattern {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				if(i==j || j==n-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}System.out.println();
		}
		
	}

}



