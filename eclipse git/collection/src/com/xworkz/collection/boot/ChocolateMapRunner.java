package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateMapRunner {

	public static void main(String[] args) {
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("5 star", 15.0);
		map.put("kitKat", 25.0);
		map.put("fruit and nuts", 85.0);
		map.put("silk", 85.0);
		map.put("Dark chocolates", 15.0);
		map.put("nestle", 25.0);
		map.put("Godiva", 60.0);
		map.put("mika", 50.0);
		map.put("hershy", 150.0);
		map.put("celebration", 156.0);
		
		System.out.println(map.size()); //10 map will not take duplicate keys
		System.out.println("accessing the keys in map");
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("~~~~~~~~accessing the values~~~~~~~~~");
		
		Collection<Double> values=map.values();
		values.forEach(e-> System.out.println(e));
		
		System.out.println("accessing both pair keys and value entries");
		
		Set<Entry<String, Double>> entry=map.entrySet();
		entry.forEach(e-> System.out.println(e));

	}

}
