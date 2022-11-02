package com.xworkz.access.things;

public class Mobile {
	public String brand="apple";
	public Phone phone=new Phone();
	
	public void use() {
		System.out.println(this.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.phone!=null) {
			System.out.println(phone.getColor());
			phone.setColor("red");
			System.out.println("updated color is"+phone.getColor());
			
			System.out.println(phone.getPhoneName());
			phone.setPhoneName("nord");
			System.out.println("updated name is"+phone.getPhoneName());
			
			System.out.println(phone.getPrice());
			phone.setPrice(3123654L);
			System.out.println("updated total phones are"+ phone.getPrice());

			System.out.println(phone.getType());
			phone.setType("juari");
			System.out.println("updated type is" + phone.getType());

			System.out.println(phone.isDurable());
			phone.setDurable(true);
			System.out.println("updated durable is" + phone.isDurable());

			System.out.println(phone.getWeight());
			phone.setWeight(136);
			System.out.println("updated weight is" + phone.getWeight());

			System.out.println(phone.getOutlet());
			phone.setOutlet("ladhak");
			System.out.println("updated outlet is" + phone.getOutlet());

			System.out.println(phone.getCode());
			phone.setCode('k');
			System.out.println("updated code is" + phone.getCode());

			System.out.println(phone.getBrand());
			phone.setBrand("ford");
			System.out.println("updated brand is" + phone.getBrand());

			System.out.println(phone.getLocation());
			phone.setLocation("hongkong");
			System.out.println("updated location is" + phone.getLocation());

			System.out.println(phone.getQuantity());
			phone.setQuantity(236);
			System.out.println("updated quantity is" + phone.getQuantity());
		}
		else {
			System.out.println("phone is null");
		}

}
}
