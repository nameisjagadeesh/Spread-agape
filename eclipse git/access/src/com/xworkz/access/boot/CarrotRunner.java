package com.xworkz.access.boot;

import com.xworkz.access.things.Carrot;
import com.xworkz.access.things.Vegitables;

public class CarrotRunner {

	public static void main(String[] args) {
		Carrot carrot=new Carrot();
		Vegitables vegitables=new Vegitables();
		System.out.println(carrot.name);
		System.out.println(carrot.vegitables);
		System.out.println(vegitables.getCode());
		System.out.println(vegitables.getColor());
		System.out.println(vegitables.getName());
		System.out.println(vegitables.getTotalVeg());
		System.out.println(vegitables.getType());
		System.out.println(vegitables.isHealthy());
		System.out.println(vegitables.getWeight());
		System.out.println(vegitables.getPlace());
		System.out.println(vegitables.getSpeciesName());
		System.out.println(vegitables.getConditions());
		System.out.println(vegitables.getQuantity());
		carrot.eatVegs();
	}

}
