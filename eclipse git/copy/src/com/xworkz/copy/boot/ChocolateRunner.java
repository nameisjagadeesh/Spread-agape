package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class ChocolateRunner {

	public static void main(String[] args) {
		Chocolate ref1=new Chocolate();
		System.out.println(ref1.names);
		ref1.names="KitKat";
		System.out.println(ref1.names);
		
		Chocolate ref2=new Chocolate();
		System.out.println(ref2.brand);
		ref2.brand="Cadburry";
		System.out.println(ref2.brand);
		
		Chocolate ref3=new Chocolate();
		System.out.println(ref3.flavour);
		ref2.flavour="fruitandnuts";
		System.out.println(ref2.flavour);
		
		Chocolate ref4=new Chocolate();
		System.out.println(ref4.price);
		ref4.price=96;
		System.out.println(ref4.price);
		
		ref2.brand="Nestle";
		System.out.println("updated brand is :"+ref2.brand);
		
		
		
	}

}
