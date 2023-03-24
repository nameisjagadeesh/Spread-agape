package com.xworkz.data;
/*
 * Whenevr we pass the object ref to the constructor it is called as copy constructor
 * its main purpose to copy the content of one object into another object with the help of object references
 */
public class CopyConstructor {
	int a;
	String b;

	public CopyConstructor(){
	a=16; b="jagadeesh";

	System.out.println(+a+" "+b);
	}
	public CopyConstructor(CopyConstructor ref){
	a=ref.a;
	b=ref.b;
	System.out.println(+a+" "+b);

	}
}

 

