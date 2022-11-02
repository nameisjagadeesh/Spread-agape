package com.xworkz.access.boot;

import com.xworkz.access.things.Dog;
import com.xworkz.access.things.Pet;

public class DogRunner {

	public static void main(String[] args) {
		Dog dog=new Dog();
		Pet pet=new Pet();
		System.out.println(dog.name);
		System.out.println(dog.pet);
		System.out.println(pet.getCode());
		System.out.println(pet.getColor());
		System.out.println(pet.getName());
		System.out.println(pet.getTotalhairs());
		System.out.println(pet.getType());
		System.out.println(pet.isHealthy());
		System.out.println(pet.getWeight());
		System.out.println(pet.getBornIn());
		System.out.println(pet.getSpeciesName());
		System.out.println(pet.getConditions());
		System.out.println(pet.getQuantity());
		dog.honest();
	}

}
