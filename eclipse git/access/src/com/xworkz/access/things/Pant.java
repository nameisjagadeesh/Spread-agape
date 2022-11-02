package com.xworkz.access.things;

public class Pant {
   public String name="joggersknight";
   public JoggerPant joggerPant=new JoggerPant("wransit", "winter", false, 'P', "prashant", "kintopantcompany", 12654L);
   public void display() {
		System.out.println(this.name);
		if (this.joggerPant != null) {

			System.out.println(this.joggerPant);
			System.out.println(joggerPant.name);
			System.out.println(joggerPant.type);
			System.out.println(joggerPant.quality);
			
			System.out.println(joggerPant.code);
			System.out.println(joggerPant.ownerName);
			System.out.println(joggerPant.producedBy);
			System.out.println(joggerPant.totalShirts);
			
			

			System.out.println(joggerPant.getBrand());
			joggerPant.setBrand("levise");
			System.out.println("after modifying " + joggerPant.getBrand());

			System.out.println(joggerPant.getPrice());
			joggerPant.setPrice(980);
			System.out.println("after modifying " + joggerPant.getPrice());

			System.out.println(joggerPant.getQuantity());
			joggerPant.setQuantity(6);

			System.out.println("after modifying " + joggerPant.getQuantity());
			
			System.out.println(joggerPant.getCountry());
			joggerPant.setCountry("australia");

			System.out.println("after modifying " + joggerPant.getCountry());
			
		} else {
			System.out.println("joggerPant is null");
		}

	}
}
