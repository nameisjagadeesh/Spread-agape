package com.xworkz.association.things.country;
//this code is on association which relates one to one variable and one to many variables (array)
public class name {
	public String oldName;
	public String newName;
	public String futureName;

	public name(String oldName, String newName, String futureName) {
		super();
		this.oldName = oldName;
		this.newName = newName;
		this.futureName = futureName;
	}

	public void showOff() {
		System.out.println(this.oldName);
		System.out.println(this.newName);
		System.out.println(this.futureName);
	}

}
