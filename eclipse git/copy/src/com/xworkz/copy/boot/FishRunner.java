<<<<<<< HEAD
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Fish;

public class FishRunner {
		

	public static void main(String[] args) {
		
		System.out.println("accessing the details of fish by passing arguments");
     Fish fish=new Fish("StarFish");
     System.out.println(fish.name);
     
     Fish fish2=new Fish("eatable", 163);
     System.out.println(fish2.type);
     System.out.println(fish2.price);
     
     Fish fish3=new Fish("Bangda", 6.5);
     System.out.println(fish3.name);
     System.out.println(fish3.weight);
     
     Fish fish4=new Fish(5.2,3.2);
     System.out.println(fish4.weight);
     System.out.println(fish4.length);
     
     Fish fish5=new Fish(4.8);
     System.out.println(fish5.weight);
     
     Fish fish6=new Fish(3.2, 96);
     System.out.println(fish6.weight);
     System.out.println(fish6.price);
     
     Fish fish7=new Fish(150);
     System.out.println(fish7.price);
     
     Fish fish8=new Fish(8.8, "anjal");
     System.out.println(fish8.weight);
     System.out.println(fish8.name);
     
	}

}
=======
package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Fish;

public class FishRunner {
		

	public static void main(String[] args) {
		
		System.out.println("accessing the details of fish by passing arguments");
     Fish fish=new Fish("StarFish");
     System.out.println(fish.name);
     
     Fish fish2=new Fish("eatable", 163);
     System.out.println(fish2.type);
     System.out.println(fish2.price);
     
     Fish fish3=new Fish("Bangda", 6.5);
     System.out.println(fish3.name);
     System.out.println(fish3.weight);
     
     Fish fish4=new Fish(5.2,3.2);
     System.out.println(fish4.weight);
     System.out.println(fish4.length);
     
     Fish fish5=new Fish(4.8);
     System.out.println(fish5.weight);
     
     Fish fish6=new Fish(3.2, 96);
     System.out.println(fish6.weight);
     System.out.println(fish6.price);
     
     Fish fish7=new Fish(150);
     System.out.println(fish7.price);
     
     Fish fish8=new Fish(8.8, "anjal");
     System.out.println(fish8.weight);
     System.out.println(fish8.name);
     
	}

}
>>>>>>> 7ecf9214bb26a7d832c46d6666c1a71dac1965fe
