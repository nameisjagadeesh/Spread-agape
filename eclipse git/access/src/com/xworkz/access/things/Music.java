package com.xworkz.access.things;

public class Music {
	public String name="patho";
	public Guitar guitar=new Guitar();
	public void playMusic() {
		System.out.println(this.name);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.guitar!=null) {
			System.out.println(guitar.getColor());
			guitar.setColor("red");
			System.out.println("updated color is"+guitar.getColor());
			
			System.out.println(guitar.getGuitarName());
			guitar.setGuitarName("yampro");
			System.out.println("updated name is"+guitar.getGuitarName());
			
			System.out.println(guitar.getPrice());
			guitar.setPrice(3123654L);
			System.out.println("updated total price are"+ guitar.getPrice());

			System.out.println(guitar.getType());
			guitar.setType("beats");
			System.out.println("updated type is" + guitar.getType());

			System.out.println(guitar.isDurable());
			guitar.setDurable(true);
			System.out.println("updated durable is" + guitar.isDurable());

			System.out.println(guitar.getWeight());
			guitar.setWeight(136);
			System.out.println("updated weight is" + guitar.getWeight());

			System.out.println(guitar.getPoducer());
			guitar.setPoducer("musicals");
			System.out.println("updated outlet is" + guitar.getPoducer());

			System.out.println(guitar.getCode());
			guitar.setCode('o');
			System.out.println("updated code is" + guitar.getCode());

			System.out.println(guitar.getBrand());
			guitar.setBrand("yamaha");
			System.out.println("updated brand is" + guitar.getBrand());

			System.out.println(guitar.getLocation());
			guitar.setLocation("hongkong");
			System.out.println("updated location is" + guitar.getLocation());

			System.out.println(guitar.getStrings());
			guitar.setStrings(7);
			System.out.println("updated quantity is" + guitar.getStrings());
		}
		else {
			System.out.println("guitar is null");
		}
	}

}
