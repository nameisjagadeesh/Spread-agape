package com.xworkz.basicPrograms.questions;

public class Pattern1 {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				// System.out.print(" ");
				if (j == 2) {
					System.out.print("R");
				} else {
					System.out.print(j);
				}
			}
			for (int k = 1; k <= i; k++) {
				// System.out.print(k);
				if (k == 2) {
					System.out.print("R");
				} else {
					System.out.print(k);
				}
			}
			System.out.println(" ");
		}

	}

}
