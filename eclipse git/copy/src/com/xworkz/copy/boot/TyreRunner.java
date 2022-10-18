package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Tyre;

public class TyreRunner {

	public static void main(String[] args) {
		System.out.println("now accessing all details using the methods");
		short branches = 6;
		int[] prices = { 1560, 1843, 3256, 6588, 3265, 1456 };
		double[] weighs = { 15.23, 16.1, 20.2, 6.3, 12.3, 9.3 };
		double[] perimeter = { 1.23, 1.1, 2.2, 3.3, 1.3, 3.3 };
		String[] names = { "kinto", "tyrerun", "meghaplus", "kirlotyres" };
		long[] revenue = { 456698L, 254662L, 3657889L, 136458L, 965486L };
		double[] radius = { 3.6, 6.1, 7.2, 6.3, 4.3, 8.3 };
		Tyre tyre = new Tyre("mrf", 'B', "running", prices, "black", weighs, perimeter, names, branches, revenue,
				radius);

		tyre.tyreDetails();

	}

}
