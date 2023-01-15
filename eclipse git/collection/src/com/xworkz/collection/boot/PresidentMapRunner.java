package com.xworkz.collection.boot;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PresidentMapRunner {

	public static void main(String[] args) {
		Map<String, String> president = new TreeMap<String, String>((e1, e2) -> e1.compareTo(e2));
		president.put("India", "Draupadi");
		president.put("usa", "biden");
		president.put("srilanka", "rajpaksha");
		president.put("pakistan", "abdul");
		president.put("France", "Macro");
		president.put("Uk", "Rishi Sunak");
		president.put("SouthAfrica", "ramphosa");
		president.put("Bangladesh", "Haseena");
		president.put("Myanmar", "Aung");
		president.put("Canada", "Justin");
		president.put("Australia", "Anthony");
		president.put("China", "xi ping");
		president.put("Russia", "Putin");
		president.put("Ukrain", "Zelensky");
		president.put("Germany", "Frank");
		president.put("Japan", "Kishida");
		president.put("SouthKorea", "Yeol");
		president.put("NorthKorea", "Kim");
		president.put("Newzland", "Adrean");
		president.put("Thailand", "NA");

		System.out.println(president.size());
		System.out.println("~~~~");
		president.forEach((a, b) -> {
			System.out.println("keys are" + a + "=" + "values" + b);
			if (b.length() >= 10) {
				 president.replace(a, "Jagadeesh allagi");
				//System.out.println("updated the presidents ===" + removed);
//				president.replace("Ukrain", "Jagadeesh");
				System.out.println("updated keys are" + a + "=" + "values" + b);
			}
		});
		
		System.out.println("updated values");
		president.forEach((x,y)-> System.out.println(x+"=="+y));
		System.out.println("~~~");
		boolean cont = president.containsKey("Japan");
		System.out.println("contains =" + cont);
		boolean cont1 = president.containsValue("Kishida");
		System.out.println("contains =" + cont1);
		System.out.println(president.size());
		
		

	}

}
