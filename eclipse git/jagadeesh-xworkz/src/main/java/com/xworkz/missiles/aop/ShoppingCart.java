package com.xworkz.missiles.aop;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

	public void checkOut() {
		
		//loggin,authentication,authoration,sanitization data which are separated called aspect
		System.out.println("checking checkout method");
	}

}
