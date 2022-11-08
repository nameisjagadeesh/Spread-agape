package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.things.Dj;

public class PartyDj extends Dj {
	
	public PartyDj() {
		System.out.println("default constructor of party dj ");
			}

	public PartyDj(String name, int noDjs, long price) {
		super(name, noDjs, price);
		
			}
	
	

}
