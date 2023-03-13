package com.xworkz.data;

import java.util.ArrayList;
import java.util.List;
/*
Generics offer you the ability to have one class which accommodates and flexible for many datatypes
generics dont work with primitive types
object type should not used it will cause type safety issues n we may get classcasteExceptions
in generics T can Extend other class and can specify the type
*/
public class GenericsRunner {

	public static void main(String[] args) {
		
		Generics<String> printer=new Generics<>("Jagadeesh");
		printer.print();
		
		Generics<Integer> number=new Generics<>(2834);
		number.print();
		
		Generics<Double> number1=new Generics<>(2834.26);
		number1.print();
		
		Generics<Boolean> boo=new Generics<>(false);
		boo.print();
		
		sound("BassBeats", "Treable");
		//<?>
		List<Integer> intList=new ArrayList<Integer>();
           intList.add(35);
           list(intList);
	}
	
	/*multiple generics
	wild cards in generics =<?> by passing the question mark as parameter which is called as wild card 
	it is used when u dontknow that generic type what exactly it is
	Bounded WildCards when one generic type extends other in wild card
	*/
	private static <T,V> void sound(T beats,V otherBeats) {
		
		System.out.println(beats);
		System.out.println(otherBeats);

	}
	
	private static void list(List<?> myList) {
		System.out.println(myList);
	}
	

}
