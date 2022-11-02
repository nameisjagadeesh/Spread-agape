package com.xworkz.access.boot;

import com.xworkz.access.things.AppleFruit;
import com.xworkz.access.things.Fruit;

public class AppleFruitRunner {

	public static void main(String[] args) {
		AppleFruit appleFruit=new AppleFruit();
		Fruit fruit=new Fruit();
		System.out.println(appleFruit.name);
		System.out.println(appleFruit.fruit);
		System.out.println(fruit.getCode());
		System.out.println(fruit.getColor());
		System.out.println(fruit.getName());
		System.out.println(fruit.getTotalFruits());
		System.out.println(fruit.getType());
		System.out.println(fruit.isHealthy());
		System.out.println(fruit.getWeight());
		System.out.println(fruit.getPlace());
		System.out.println(fruit.getSpeciesName());
		System.out.println(fruit.getConditions());
		System.out.println(fruit.getquantity());
		appleFruit.eatFruit();
		
	}

}
