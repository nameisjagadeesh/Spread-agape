package com.xworkz.access.boot;

import com.xworkz.access.things.JoggerPant;
import com.xworkz.access.things.Pant;

public class PantRunner {

	public static void main(String[] args) {
		Pant pant=new Pant();
		JoggerPant joggerPant=new JoggerPant("wransit", "winter", false, 'P', "prashant", "kintopantcompany", 12654L);
		System.out.println(pant.name);
		System.out.println(pant.joggerPant);
		System.out.println(joggerPant.getBrand());
		System.out.println(joggerPant.getPrice());
		System.out.println(joggerPant.getQuantity());
		
		pant.display();
	}

}
