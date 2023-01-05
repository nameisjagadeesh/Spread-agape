package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedExamplesRunner {

	public static void main(String[] args) {
		List<Integer> ref = new ArrayList<Integer>();
		ref.add(652);
		ref.add(521);
		ref.add(256);
		ref.add(21);
		ref.add(215);

		Collections.sort(ref);
		System.out.println(ref); // assending order
		Collections.reverse(ref);
		System.out.println(ref); // descending order

		ref.stream().sorted().forEach(e -> System.out.println(e)); // assending order
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		ref.stream().sorted(Comparator.reverseOrder()).forEach(e -> System.out.println(e)); // descending order

	}

}
