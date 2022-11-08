package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Catering;
import com.xworkz.inheritance.things.childclass.FunctionCatering;

public class CateringRunner {

	public static void main(String[] args) {
		short workers=36;
		Catering catering=new Catering("Ring ceromany", workers, 26200);
		catering.printDetails();
		System.out.println("~~~~~~~~~~~~~~~~");
		
		short labours=35;
		FunctionCatering catering2=new FunctionCatering("house opening",labours,29999 );
		catering2.print();
				
	}

}
