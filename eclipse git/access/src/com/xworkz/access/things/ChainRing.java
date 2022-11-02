package com.xworkz.access.things;

public class ChainRing {
	public String brand="malbar";
	public Ring ring=new Ring();
	public void wear() {
		System.out.println(this.brand);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		if(this.ring!=null) {
			System.out.println(ring.getColor());
			ring.setColor("orange");
			System.out.println("updated color is"+ring.getColor());
			
			System.out.println(ring.getName());
			ring.setName("pink lady");
			System.out.println("updated color is"+ring.getName());
			
			System.out.println(ring.getPrice());
			ring.setPrice(123654L);
			System.out.println("updated total rings are"+ ring.getPrice());

			System.out.println(ring.getType());
			ring.setType("juari");
			System.out.println("updated type is" + ring.getType());

			System.out.println(ring.isHard());
			ring.setHard(true);
			System.out.println("updated hard is" + ring.isHard());

			System.out.println(ring.getWeight());
			ring.setWeight(26);
			System.out.println("updated weight is" + ring.getWeight());

			System.out.println(ring.getCompany());
			ring.setCompany("joy");
			System.out.println("updated company is" + ring.getCompany());

			System.out.println(ring.getCode());
			ring.setCode('B');
			System.out.println("updated code is" + ring.getCode());

			System.out.println(ring.getCompany());
			ring.setCompany("vanring");
			System.out.println("updated type is" + ring.getCompany());

			System.out.println(ring.getRingTag());
			ring.setRingTag("pure");
			System.out.println("updated weather is" + ring.getRingTag());

			System.out.println(ring.getQuantity());
			ring.setQuantity(236);
			System.out.println("updated quantity is" + ring.getQuantity());
		}
		else {
			System.out.println("ring is null");
		}
	}

}
