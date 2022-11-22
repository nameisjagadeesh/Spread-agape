package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.Currancy;

public class CurrancyRunner {

	public static void main(String[] args) {
		Currancy currancy=new Currancy();
		currancy.setAcceptableCountries("all countries");
		currancy.setCode('D');
		currancy.setConvertingPrice(82.5);
		currancy.setCountryName("USA");
		currancy.setMakingCost(10.2);
		currancy.setMaterial("papers");
		currancy.setStrong(true);
		currancy.setTotalCurrancy(6);
		currancy.setType("international");
		currancy.setValidity(100);
		
		System.out.println(currancy);
		Currancy currancy2=new Currancy("local", 20, 'R', 12, false, "india", 90, "paper", 120, "only few");
		System.out.println(currancy2);
		boolean ref=currancy.equals(currancy2);
		System.out.println(ref);
		
	}

}
