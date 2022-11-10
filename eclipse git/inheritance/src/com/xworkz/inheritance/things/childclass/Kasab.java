package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.things.Terrorist;

public class Kasab extends Terrorist {
	public String arrestedBy;

	public Kasab(String country, String offence, double age, String arrestedBy) {
		super(country, offence, age);
		this.arrestedBy = arrestedBy;
	}

	@Override // this is to make compile time overriding
	public void attacks() {
		super.attacks();
		System.out.println(this.arrestedBy);
		System.out.println("kasab overriden the terrorist class");
		
	}

	public void arrest() {
		System.out.println("kasab overriden the terrorist class arrest method");
	}

}
