package com.xworkz.access.things;

public class Shirt {
	public String name = "bhintop";
	public SweatShirt sweatShirt = new SweatShirt("roadpro", "string", true, "country", 'I', "jagadeesh",
			"roadster company", 6654123L);

	public void wearIt() {
		System.out.println(this.name);
		if (this.sweatShirt != null) {

			System.out.println(this.sweatShirt);
			System.out.println(sweatShirt.name);
			System.out.println(sweatShirt.type);
			System.out.println(sweatShirt.quality);
			System.out.println(sweatShirt.country);
			System.out.println(sweatShirt.code);
			System.out.println(sweatShirt.ownerName);
			System.out.println(sweatShirt.producedBy);
			System.out.println(sweatShirt.totalShirts);
			
			

			System.out.println(sweatShirt.getBrand());
			sweatShirt.setBrand("levise"); //modified
			System.out.println("after modifying " + sweatShirt.getBrand());

			System.out.println(sweatShirt.getPrice());
			sweatShirt.setPrice(980);
			System.out.println("after modifying " + sweatShirt.getPrice());

			System.out.println(sweatShirt.getQuantity());
			sweatShirt.setQuantity(6);
			System.out.println("after modifying " + sweatShirt.getQuantity());
		} else {
			System.out.println("sweatshirt is null");
		}

	}

}
