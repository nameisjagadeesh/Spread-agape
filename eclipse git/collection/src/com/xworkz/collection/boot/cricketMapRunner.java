package com.xworkz.collection.boot;

import java.util.Map;
import java.util.TreeMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class cricketMapRunner {

	public static void main(String[] args) {
		Map<String, Double> cricket = new TreeMap<String, Double>((e1, e2) -> e2.compareTo(e1)); // this is to sort
		cricket.put("Kohli", 32000D);
		cricket.put("Dhoni", 25000D);
		cricket.put("Sachin", 8000D);
		cricket.put("Pointing", 35652D);
		cricket.put("Devillers", 5632D);

		cricket.forEach((a, b) -> {
			System.out.println("keys is " + a + "=" + "value is " + b);

			if (b>= 10000) {

				Double ref=cricket.remove(a);
				System.out.println(ref);
			}

		});
		
		cricket.forEach((x,y)-> System.out.println(x+"------"+y));
		
		
		

	}

}
