package com.xworkz.basicPrograms.questions;

public class RevTriangle {

	public static void main(String[] args) {
		int n = 6;
		for (int i = n; i >= 1; i--) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");

			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		
		for (int l=1;l<=100;l++) {
			System.out.println(l);
		}
	}

}
