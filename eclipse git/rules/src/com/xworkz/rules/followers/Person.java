package com.xworkz.rules.followers;

public abstract class Person {
	private String firstName;
	private String lastName;
	private double age;
	private boolean working;
	private int siblings;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public int getSiblings() {
		return siblings;
	}

	public void setSiblings(int siblings) {
		this.siblings = siblings;
	}

	public void eat() {
		System.out.println("running eat from person");
	}

	public void sleep() {
		System.out.println("running sleep from person");
	}

}
