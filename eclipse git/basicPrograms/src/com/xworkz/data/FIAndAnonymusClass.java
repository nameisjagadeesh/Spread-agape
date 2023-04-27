package com.xworkz.data;


@FunctionalInterface
interface Axa{
	
	void print();
	String toString();  //we can use only Object methods in FI like String toString();
	
}

public class FIAndAnonymusClass {

	public static void main(String[] args) {
		
//		Axa obj=new Axa(){ // anonymus inner class-creating a class without a name
//
//			
//			public void print() {
//				System.out.println("hey jaggi");
//			}
//		};
		
		Axa obj=()->{  //this is lambda expression
			
			System.out.println("hey jaggi"); //it is not called automatically ,u have to cl it by obj.show
		};
		obj.print();
	}

}
