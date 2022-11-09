package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Dj;
import com.xworkz.inheritance.things.childclass.PartyDj;

public class DjRunner {

	public static void main(String[] args) {
		Dj dj = new Dj();
		System.out.println(dj);
		Dj dj2 = new Dj("rockbay", 6, 523365L);
		System.out.println(dj2.name);
		System.out.println(dj2.noDjs);
		System.out.println(dj2.price);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		PartyDj dj3 = new PartyDj("maxgo", 20, 65210L);
		System.out.println(dj3.name);
		System.out.println(dj3.noDjs);
		System.out.println(dj3.price);
	}

}
