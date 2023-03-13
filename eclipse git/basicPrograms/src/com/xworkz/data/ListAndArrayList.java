package com.xworkz.data;

import java.util.ArrayList;
import java.util.List;

/*
 * follows insertion order and allow duplicates
 * there is a one hashcode for all the elements while set has different hashcode for each elements
 * Linked List vs ArrayList-
 * in AL getting an element is faster and in LL adding or removing an element is way faster than AL
 * AL is used for creating a static list which doesnt change very much
 */
public class ListAndArrayList {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		
		names.add("jagadeesh");
		names.add("hari");
		names.add("om");
		names.add("prashant");
		names.add("jhon");
		names.add("jagadeesh");

		System.out.println(names+"--"+names.hashCode());
		System.out.println(names.size());
		names.remove(0);   //removing by index number
		System.out.println("after removing =="+names+"and size is ="+names.size());
	}

}
