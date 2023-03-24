package com.xworkz.data;

public class LambdaExpressionRunner {

	/*
	 * Lambda is a short cut to define an implementation of a Functional interface
	 * in lambda compiler knows return type automatically,in this access specifier
	 * is not need and dont need the method name
	 * () is not needed for single parameter
	 * Lambdas can be only used in the context of Functional interface
	 * if interface has more than one abstract methods ,we cant use lambda expression
	 * In Lambda we are only able to define the implementation of one method
	 * 
	 */

	public static void main(String[] args) {
		LambdasInterface lambdaPrint = e -> System.out.println("Hi"+e);
		printThings(lambdaPrint);
		LambdasInterface lambdaPrint1 = e -> System.out.println("Bye");
		printThings(lambdaPrint1);
	}

	static void printThings(LambdasInterface things) {

		things.print("!");
	}

}
