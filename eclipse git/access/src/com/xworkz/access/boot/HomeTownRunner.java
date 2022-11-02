package com.xworkz.access.boot;

import com.xworkz.access.things.Home;
import com.xworkz.access.things.Town;

public class HomeTownRunner {

	public static void main(String[] args) {
		Home home=new Home();
		Town town=new Town();
		System.out.println(home.name);
		System.out.println(home.town);
		System.out.println(town.getCode());
		System.out.println(town.getCity());
		System.out.println(town.getName());
		System.out.println(town.getPopulation());
		System.out.println(town.getType());
		System.out.println(town.isPolluted());
		System.out.println(town.getArea());
		System.out.println(town.getState());
		System.out.println(town.getPanchayatName());
		System.out.println(town.getMla());
		System.out.println(town.getHouses());
		home.live();
	}

}
