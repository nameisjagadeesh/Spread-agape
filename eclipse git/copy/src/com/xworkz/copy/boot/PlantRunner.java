package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Plant;

public class PlantRunner {

	public static void main(String[] args) {
		//here i am calling the methods by passing arguments
				System.out.println("accessing all details by calling the methods");
				short life = 80;
				int[] total = { 1503, 1836, 3926, 6258, 3625, 1556 };
				
				double[] weighs = { 15.23, 16.1, 20.2, 6.3, 12.3, 9.3 };
				double[] length = { 12.3, 21.1, 22.2, 13.3, 16.3, 33.3 };
				String[] colors = { "white", "red", "green", "yellow" };
				long[] population = { 956698L, 554662L, 857889L, 336458L, 165486L }; 
				String[] loaction = {  "india", "australia", "nambia", "africa","china"};
				Plant plant=new Plant("banyan tree", total, colors, weighs, life, "wetland", life, population, length, loaction);
				plant.details();
	}

}
