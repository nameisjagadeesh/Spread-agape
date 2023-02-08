package com.xworkz.data;
//increase salary by 10% if age is >25
public class EmplyeeDTO {

	private String name;
	private int age;
	private double salary;

	// private String name;

	

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "EmplyeeDTO [salary=" + salary + "]";
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public EmplyeeDTO(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

}
