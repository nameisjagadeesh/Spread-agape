package com.xworkz.data;


//Generics offer you the ability to have one class which is flexible for many datatypes

public class Generics<T> {

	T display;

	public Generics(T display) {
		this.display = display;
	}

	public void print() {

		System.out.println("displayed   "+display);
	}
}
