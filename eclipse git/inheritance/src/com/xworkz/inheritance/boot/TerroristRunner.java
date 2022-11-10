package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Terrorist;
import com.xworkz.inheritance.things.childclass.Kasab;

public class TerroristRunner {

	public static void main(String[] args) {
		Terrorist terrorist = new Terrorist();//invoked the default constructor of terrorist
		terrorist.attacks();//here jvm will give default values 
		terrorist.arrest();
		
		Kasab kasab=new Kasab("pakistan", "mumbai attack", 18, "indian army");
		kasab.attacks(); //this is overriden method
		kasab.arrest();
	}

}
