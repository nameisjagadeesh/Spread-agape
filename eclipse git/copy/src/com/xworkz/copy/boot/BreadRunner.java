package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Bread;

public class BreadRunner {

	public static void main(String[] args) {
		System.out.println("passed args in BreadRunner and accessed the bread details");
		Bread bread = new Bread("Brownbread");
		System.out.println(bread.type);
		System.out.println("=======///");

		Bread jam = new Bread("milkBread", true);
		System.out.println(jam.type);
		System.out.println(jam.quality);
		System.out.println("=======///");

		Bread kisan=new Bread("round",45);
		System.out.println(kisan.shape);
		System.out.println(kisan.price);
		System.out.println("=======///");
		
		Bread bread2=new Bread("BigBread",true,60);
		System.out.println(bread2.companyName);
		System.out.println(bread2.quality);
		System.out.println(bread2.price);
		System.out.println("=======///");
		
		Bread bread3=new Bread(false, "nandini");
		System.out.println(bread3.companyName);
		System.out.println(bread3.quality);
		System.out.println("=======///");
		
		Bread bread4=new Bread(true);
		System.out.println(bread4.quality);
		System.out.println("=======///");
		
		Bread bread5=new Bread(50);
		System.out.println(bread5.price);
		System.out.println("=======///");
		
		Bread bread6 =new Bread(80, "wheatBread");
		System.out.println(bread6.price);
		System.out.println(bread6.type);
		System.out.println("=======///");
		
		
		
		
	}

}
