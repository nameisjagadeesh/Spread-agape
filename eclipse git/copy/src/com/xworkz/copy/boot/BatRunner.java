package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Bat;

public class BatRunner {

	public static void main(String[] args) {
		//here i am calling the methods by passing arguments
				System.out.println("accessing all details by calling the methods");
				short warranty = 5;
				int[] failed = { 1503, 1836, 3926, 6258, 3625, 1556 };		
				double[] weighs = { 300, 250, 365, 199, 625, 485 };
				double[] width = { 1.3, 2.1, 2.2, 3.3, 6.3, 3.9 };
				String[] colors = { "white", "woodcolor", "red",  };
				long[] total = { 6958L, 3562L, 65789L, 96458L, 15486L }; 
				String[] loaction = {  "kohli", "sachin", "dhoni", "rahul","warner"};
				
				Bat bat=new Bat(warranty, "SSS", total, colors, weighs, true, "playing", warranty, failed, width, loaction);
				bat.playit();
	}

}
