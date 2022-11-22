package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.WaterBottel;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottel bottel = new WaterBottel();
		bottel.setBrand("itc");
		bottel.setCode('w');
		bottel.setLifeSpan(25);
		bottel.setName("kinlay");
		bottel.setPrice(65);
		bottel.setQuantity(22);
		bottel.setQuality(true);
		bottel.setHeight(200.3);
		bottel.setType("drinking");
		System.out.println(bottel);
		
		WaterBottel bottel2 = new WaterBottel("energydrink", 56.3, 'h', 20, false, "bisleri", 40, "abc", 30);
		System.out.println(bottel2);
		boolean ref=bottel.equals(bottel2);
		System.out.println(ref);
		
		

	}

}
