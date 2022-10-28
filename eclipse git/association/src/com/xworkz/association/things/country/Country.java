package com.xworkz.association.things.country;

import com.xworkz.association.constants.Gender;
//this code is on association which relates one to one variable and one to many variables (array)

public class Country {
	public String name;
	public City[] cities;
	public President president;
	public Gender gender;
	public Country(String name) {
		super();
		this.name = name;
	}
	public void setCities(City[] cities) {
		this.cities = cities;
	}
	public void setPresident(President president) {
		this.president = president;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public void display() {
		System.out.println(this.name);
		if(cities!=null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				System.out.println(city);
				city.showOff();
			}
		}
			else {
				System.out.println("city is null");
			}
		
		
		if(this.president!=null) {
			System.out.println(this.name);
			this.president.details();
		}
		else {
			System.out.println("president is null");
		}
		
		System.out.println(this.gender);
	}
	
	
	

}
