package com.xworkz.association.things.country;
//this code is on association which relates one to one variable and one to many variables (array)
public class City {
	public name nameIs;
	public double areaInSqKm;
	public boolean capital;

	public City(name nameIs) {
		super();
		this.nameIs = nameIs;
	}

	public void setAreaInSqKm(double areaInSqKm) {
		this.areaInSqKm = areaInSqKm;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public void showOff() {
		if (this.nameIs != null) {
			System.out.println(this.nameIs);
			this.nameIs.showOff();
		} 
		else
		{
			System.out.println("the nameis null");
		}
		
		System.out.println(this.areaInSqKm);
		System.out.println(this.capital);
	}
}
