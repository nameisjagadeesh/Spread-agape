package com.xworkz.collection.boot;

import java.util.Map;
import java.util.TreeMap;

public class MobileMapRunner {

	public static void main(String[] args) {
		Map<String, Double> mobile = new TreeMap<String, Double>((e1, e2) -> e1.compareTo(e2));
		mobile.put("Iphone", 63000D);
		mobile.put("oneplus", 40000D);
		mobile.put("vivo", 18000D);
		mobile.put("samsung", 12500D);
		mobile.put("realme", 17000D);
		mobile.put("oppo", 25325D);
		mobile.put("nothing", 31000D);
		mobile.put("mi", 29632D);
		mobile.put("iphone 13", 75000D);
		mobile.put("note 10", 99000D);

		mobile.forEach((a, b) -> {
			System.out.println("keys are " + a + "=" + "values " + b);
			if (b >= 25000) {
				System.out.println("the greater price is" + b);
			}
			System.out.println("~~~~~~~");
			if (a.length() > 5) {
				System.out.println("the greater keys are  " + a);
			}
			
		});

	}

}
