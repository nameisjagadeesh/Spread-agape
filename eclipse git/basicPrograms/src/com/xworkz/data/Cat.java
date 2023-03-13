package com.xworkz.data;

public class Cat {

	String name;
	int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;

	}
	
	public void catSound() {
		
		System.out.println("meowwwwwwwww");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
