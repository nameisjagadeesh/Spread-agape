package com.xworkz.data;

import java.util.Optional;

public class OptionalRunner {

	public static void main(String[] args) {

		Optional<Cat> optionalCat = findPetNameByName("blackey");
		// get method will return value inside the optional
		if (optionalCat.isPresent()) {
			System.out.println(optionalCat.get().getAge());
		} else {
			System.out.println(0);
		}
		/*
		 * orElse method will return cat value if present otherwise return the parameter
		 * passed in orElse method
		 * other methods orElseGet(),orElseThrow()
		 */
		Cat myCat = optionalCat.orElse(new Cat("cat illa", 0)); //it will printed in sop if null is returned in find method
		System.out.println("orElse method value ,cat age="+myCat.age+" name= "+myCat.name);

		// above and below if conditions logics same
		/*
		 * why optional-reason of returning optional is to tell user of method that
		 * value looking for may or maynot return so telling user to deal with that
		 * situation
		 */
//		if (myCat != null) {
//
//			System.out.println(myCat.age); // this will give nullPointerexception as we return Null instead of cat so
//											// use if
//
//		}
//		else {
//			System.out.println(0);
//		}
		/*
		 * for the above problem optionals come in if it contains cat ,it will return
		 * cat otherwise returns empty box main purpose of optional to tell user of the
		 * method that value might not exist so to avoid this ,use optional keyword with
		 * Cat
		 */
	}

	private static Optional<Cat> findPetNameByName(String name) {
		Cat cat = new Cat(name, 6);
		return Optional.ofNullable(cat); // offNullable used to avoid exception (noSuchElementException)

	}
}
