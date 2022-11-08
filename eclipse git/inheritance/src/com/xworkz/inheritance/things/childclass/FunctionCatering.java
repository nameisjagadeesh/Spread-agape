package com.xworkz.inheritance.things.childclass;

import com.xworkz.inheritance.things.Catering;

public class FunctionCatering extends Catering{
	
	public FunctionCatering() {
			}

	public FunctionCatering(String type, short workers, int charges) {
		super(type, workers, charges); //super  constructor of catering
			}
	public void print() {
		System.out.println(type);
		System.out.println(workers);
		System.out.println(charges);
	}
	
	

}
