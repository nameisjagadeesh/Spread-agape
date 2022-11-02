package com.xworkz.access.things;

public class Dog {
	public String name="ramu";
	public Pet pet=new Pet();
	public void honest() {
		System.out.println(this.name);
		if(this.pet!=null) {
			System.out.println(pet.getColor());
			pet.setColor("orange");
			System.out.println("updated color is"+pet.getColor());
			
			System.out.println(pet.getName());
			pet.setName("pink lady");
			System.out.println("updated color is"+pet.getName());
			
			System.out.println(pet.getTotalhairs());
			pet.setTotalhairs(2365412L);
			System.out.println("updated total hair are"+ pet.getTotalhairs());

			System.out.println(pet.getType());
			pet.setType("juari");
			System.out.println("updated type is" + pet.getType());

			System.out.println(pet.isHealthy());
			pet.setHealthy(true);
			System.out.println("updated type is" + pet.isHealthy());

			System.out.println(pet.getWeight());
			pet.setWeight(136);
			System.out.println("updated weight is" + pet.getWeight());

			System.out.println(pet.getBornIn());
			pet.setBornIn("home");
			System.out.println("updated place is" + pet.getBornIn());

			System.out.println(pet.getCode());
			pet.setCode('B');
			System.out.println("updated code is" + pet.getCode());

			System.out.println(pet.getSpeciesName());
			pet.setSpeciesName("appletiocity");
			System.out.println("updated type is" + pet.getSpeciesName());

			System.out.println(pet.getConditions());
			pet.setConditions("dry weather");
			System.out.println("updated weather is" + pet.getType());

			System.out.println(pet.getQuantity());
			pet.setQuantity(5);
			System.out.println("updated type is" + pet.getQuantity());
		}
		else {
			System.out.println("pet is null");
		}
	}

}
