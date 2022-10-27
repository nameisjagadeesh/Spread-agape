package com.xworkz.association.things;

public class God {
	public String name;
	public String gender;
	public String power;
	public Weapon weapon;

	public God(String name, String gender, String power) {
		super();
		this.name = name;
		this.gender = gender;
		this.power = power;
	}

	public void show() {
		System.out.println("God name " + name);
		System.out.println(gender);
		System.out.println("God power " + power);
		Weapon weapon = new Weapon("Trishul", "Hold in Hand", 5.45);
		weapon.show();
	}

}
