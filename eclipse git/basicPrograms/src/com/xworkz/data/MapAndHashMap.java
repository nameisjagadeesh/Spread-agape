package com.xworkz.data;

import java.util.HashMap;

    /*
 * Map : it is a set of keys and values
 * hashmap is a implementaion
 * map doest guarantee insertion order
 * put method will insert and update the value
 * put while updating ,if element exist then it will update value ,if nit exist it will add the elemnt
 * where as replace method only do if element exist otherwise will not update
 */
public class MapAndHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> ids=new HashMap<>();
		ids.put("jagadeesh", 254);
		ids.put("kkr", 254);
		ids.put("hih", 52);
		ids.put("jaha", 52);
		ids.put("aha", 63);
		
		System.out.println("ONLY values"+ids.values());
		System.out.println("ONLY KEYS"+ids.keySet());
		System.out.println("both KEYS and values"+ids.entrySet());
		System.out.println(ids.get("jagadeesh")); //to get perticuler values
		
		System.out.println("!!~~~~~~~~~~!!");
		ids.put("jagadeesh", 2834);
		System.out.println(ids);
		ids.put("prashant", 96);
		System.out.println(ids);
		ids.replace("prashant", 852);
		System.out.println(ids);
		
		ids.replace("brahmi", 256); //as element not exist then it wont replace
		System.out.println(ids);
		
	}

}
