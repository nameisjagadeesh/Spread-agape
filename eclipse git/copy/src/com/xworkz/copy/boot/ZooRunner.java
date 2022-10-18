package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Zoo;

public class ZooRunner {

	public static void main(String[] args) {
		//here i am calling the methods by passing arguments
				System.out.println("accessing all details by calling the methods");
				String[] animals= {"tiger","lion","monkey","wilddog","elephant"};
				Zoo zoo=new Zoo("bhannerghatta zoo", animals, 65478632L, 65.23, "bengaluru");
				zoo.display();
				
				String[] lives= {"maques","rhino","snakes","deer","wildpig"};
				Zoo zoo2=new Zoo("nagarhole", lives, 54789611L, 45.32, "karnataka");
				zoo2.display();
				
				
	}

}
