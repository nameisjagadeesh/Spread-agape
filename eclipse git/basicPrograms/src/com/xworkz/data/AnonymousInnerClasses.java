package com.xworkz.data;

/*
 * AnonymousInnerClasses is class with no name that we used to instantiate only one object ever
 * this class can extend any other class or can implements other interface
 * this will allow you to create unnamed subclass of other class Like Pet and create one single object of that anonymous class
 * Runnable interface used when we create multi threaded program
 */
public class AnonymousInnerClasses {

	public static void main(String[] args) {
		
		Pet pet=new Pet();
		pet.makeNoise();
		
		//to create anonymous sub class of pet
		
		Pet otherPet=new Pet() {
			@Override
			public void makeNoise() {
				System.out.println("bow bow bow"); //this will override
			}
		};
		
		otherPet.makeNoise(); // this cant used above the otherPet Instance
		
		// creating anonymous Runnable
		Runnable myAnonymousRunnable=new Runnable() { //it is not object creation
			
			@Override
			public void run() {
				System.out.println("it is anonymus Runnable");				
			}
		};
		myAnonymousRunnable.run();
	}

}


