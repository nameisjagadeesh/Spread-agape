package com.xworkz.data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*set,unlike list will not follw the instertion order 
 * dont allow the duplicates
 * with set we cant remove the element by using the index number unlike list
 * set maintains the uniquness via the hashcode for each element and this set implementation uses hashTable as
 * its storage mechanism behind the scence
 * Treeset-for natural ordering ()ascending  default
 * why to use hasSet over TreeSet bcz hash set is way faster than tree set
 * tree set used only when we care about ordering the elements
 * LinkedHasSet-it doesnt maintain natural order but it maintains the insertion order
 */
public class SetAndHashSet {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Jagadeesh");
		names.add("Hari");
		names.add("John");
		names.add("bharat");
		names.add("Jagadeesh"); //duplicated 
//		System.out.println(names.size());
//		System.out.println(names); 
//		names.remove("Hari");
//		System.out.println("after removing "+names);
//		System.out.println("after removing "+names.size());
//		names.clear(); //remove all elements
//		System.out.println("after clear"+names+"size= "+names.size());
//		System.out.println("~~~~~~~~~~~");
		
	//	names.forEach(System.out::println);
		Iterator<String> itr= names.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println(string+"--"+string.hashCode());
			
		}
		System.out.println("~~~~~~~~~~");
		//adding list to set and avoid the duplicates
		List<Integer> number=new ArrayList<Integer>();
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(1);
		number.add(3);
		number.add(1);
		System.out.println("numbers"+number+"--"+number.hashCode());
		System.out.println("~~~~~~~~~~~~~~");
		Set<Integer> numberSet=new HashSet<Integer>();
		numberSet.addAll(number);
		System.out.println(numberSet+"---"+numberSet.hashCode());
	}

}
