package com.xworkz.copy.boot;
//here calling the method of timeing in runner file to access the enum variable properties

import com.xworkz.copy.constants.Codes;
import com.xworkz.copy.constants.Numbers;
import com.xworkz.copy.constants.Type;
import com.xworkz.copy.examples.Clock;

public class ClockRunner {

	public static void main(String[] args) {
		System.out.println("here i am accessing the ref values of enum by calling the method");
		
		Clock clock=new Clock("Ajanta", Type.DIGITAL, Numbers.ONE, Codes.A, 2.5, 252365L);
		clock.timeing();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Clock clock2=new Clock("Fastrack", Type.ANALOG, Numbers.TWO, Codes.F, 1.1, 32145688L);
		clock2.timeing();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		Clock clock3=new Clock("timex", Type.TABLE, Numbers.SIX, Codes.D, 3.3, 6541236L);
		clock3.timeing();
		
	}

}
