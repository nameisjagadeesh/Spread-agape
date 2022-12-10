package com.xworkz.exceptions.events;

import java.rmi.activation.ActivationException;

public class EventCreator {
	public void method1() throws ActivationException {
		this.method2();
	}

	public void method2() throws ActivationException {
		this.method3();

	}

	public void method3() throws ActivationException {
		this.method4();

	}

	public void method4() throws ActivationException {
		this.method5();

	}

	public void method5() throws ActivationException { //you can throw here exception/throwable and error but it will give good readability
		throw new ActivationException(); //declaring and creating the exceptional event

	}

}
