package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.*;

public class FootWearRunner {

	public static void main(String[] args) {
		
		
		Crocs crocs=new Crocs();
		
		crocs.brand="nike";//updated brand
		crocs.print(); //for fotwear no need of instantiation for footwear as crocs in herited footwear
		crocs.details();//for crocs 
		crocs.totalPrice();
		
	}

}
