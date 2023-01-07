package com.xworkz.collection.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AreaMapRunner {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("vijayanagar", "560040");
		map.put("yeshwantapura", "560022");
		map.put("brigade road", "560001");
		map.put("byatarayanapur", "560023");
		map.put("kothnur", "560063");
		map.put("adugodi", "560030");
		map.put("agara", "560034");
		map.put("rajajinagar", "560010");
		map.put("hebbal", "560024");
		map.put("gandhi nagar", "560009");

		System.out.println(map.size());
		System.out.println("accessing the keys");
		Set<String> keys=map.keySet();
		keys.forEach(e-> System.out.println(e));
		System.out.println("accessing the values");
		Collection <String> value=map.values();
		value.forEach(e-> System.out.println(e));
		System.out.println("accessing the both");
		Set<Entry<String, String>> entry=map.entrySet();
		entry.forEach(e-> System.out.println(e));
	}

}
