package com.xworkz.association.things;


import com.xworkz.association.constants.Shape;

public class Pillar {
	public int id;
	public String place;
	public Shape shape = Shape.CYLINDRICAL;
	public double height;
	public String supporting;
	public Company company;

	

	public Pillar(int id, String place, Shape shape, double height, String supporting) {
		super();
		this.id = id;
		this.place = place;
		this.shape = shape;
		this.height = height;
		this.supporting = supporting;
	}



	public void showThings() {
		System.out.println(this.id);
		System.out.println(this.place);
		System.out.println(this.shape);
		System.out.println(this.height);
		System.out.println(this.supporting);
		Company compnay = new Company("L&T", "MultiType&MNC");
		compnay.showOff();
	}

}
