package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class PgMapRunner {

	public static void main(String[] args) {
		Map<String, Double> map=new HashMap<String, Double>();
		map.put("emerland", 6000.0);
		map.put("ganesh", 7000.0);
		map.put("layman", 6500.0);
		map.put("stayhappy", 8000.0);
		map.put("livehappy", 4500.0);
		map.put("pallavi", 5500.0);
		map.put("deewan", 6500.0);
		map.put("kingstay", 8500.0);
		map.put("homestay", 6800.0);
		map.put("lakshmi", 7500.0);
		
		System.out.println(map.size());
		System.out.println("accessing the keys");
		Set<String> keys=map.keySet();
		keys.forEach(e-> System.out.println(e));
		System.out.println("accessing the values");
		Collection<Double> value=map.values();
		value.forEach(e-> System.out.println(e));
		System.out.println("accessing both keys and values");
		Set<Entry<String,Double>> entry=map.entrySet();
		entry.forEach(e-> System.out.println(e));


	}

}
