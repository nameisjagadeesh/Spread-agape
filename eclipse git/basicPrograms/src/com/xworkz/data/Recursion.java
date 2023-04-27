package com.xworkz.data;

public class Recursion {
//Recursion-when a method is called on itself
	public static void main(String[] args) {
		sayHi(5);
	}
	
	private static void sayHi(int count) {
		System.out.println("hi jaggi");
		if(count<=1) { //count is basescase
			return;
		}
		sayHi(count-1);  //at end gives stack overFlow error when size exceeds ,to avoid this add int parameter in method
		//in recursion one method calls over n over again in stack n romoves
	}
	
	//baseCase in recursion is a condition inside the method where it will return without making another recursive call


}
