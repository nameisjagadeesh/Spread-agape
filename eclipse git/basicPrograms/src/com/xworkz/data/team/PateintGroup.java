package com.xworkz.data.team;

public class PateintGroup {

	private String name;
	private int age;
	private String type;
	private String bill;

	public PateintGroup() {
		// TODO Auto-generated constructor stub
	}
	public PateintGroup(String name, int age, String type, String bill) {
		super();
		this.name = name;
		this.age = age;
		this.type = type;
		this.bill = bill;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBill() {
		return bill;
	}

	public void setBill(String bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "PateintGroup [name=" + name + ", age=" + age + ", type=" + type + ", bill=" + bill + "]";
	}
}
