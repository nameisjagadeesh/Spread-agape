package com.xworkz.inheritance.things;

public final class FinalKeyWord {
	//here the class cant be inherited 
	public final String name="jagadeesh";
	private final int age=65;
	protected final char codes='D';
	final boolean honesty=true;
	
	final String read() { //this final method can be inherited but cant be overriden
		
		return "hi";
	}

	public int getAge() {
		return age;
	}
	
	
	

	
}
