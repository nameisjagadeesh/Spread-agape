package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.God;

public class GodRunner {

	public static void main(String[] args) {
		God god=new God();
		god.setEntryFees(65);
		god.setGodCode('g');
		god.setGodPoojaName("arati");
		god.setLocation("tirupati");
		god.setName("venkatesh");
		god.setOriginalName("balaji");
		god.setPowerFull(true);
		god.setPriestName("mahanandiswami");
		god.setTotalDieties(15);
		god.setTotalTemples(100);
		System.out.println(god);
		
		God god2=new God("manjunath", "manjunath", 10, 'M', "darmasthala", 6, "prabhu", 20, true, "malarpane");
		System.out.println(god2);
		boolean ref=god.equals(god2);
		System.out.println(ref);
	}

}
