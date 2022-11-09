package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.things.Director;

public class Prashant extends Director {
	public int age;

	public Prashant() {
	}

	public Prashant(String type, String industryName, int age) {
		super(type, industryName);
		this.age = age;
	}
	public void direct() {  
		super.direct(); //this is to overriding
		System.out.println(this.age);
	}

}
