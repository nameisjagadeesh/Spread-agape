package com.xworkz.association.constants;
//this code is on association which relates one to one variable and one to many variables (array)
public enum Gender {
	MALE("male"),FEMALE("female"),TRANS("transgender");
	

	public String sexName;
	
	private Gender(String sexName) {
		this.sexName = sexName;
	}
	

}
