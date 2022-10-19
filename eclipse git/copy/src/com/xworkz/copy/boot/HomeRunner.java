package com.xworkz.copy.boot;

import com.xworkz.copy.constants.Floors;
import com.xworkz.copy.constants.OwnerName;
import com.xworkz.copy.examples.Home;

public class HomeRunner {

	public static void main(String[] args) {
		Home home=new Home(6, "residential", OwnerName.JAGADEESH, Floors.FIVE, 15000, true);
			home.display();
		System.out.println("===========");
		
		Home home2=new Home(400, "commercial", OwnerName.SUNIL, Floors.NINE, 30000, false);
		home2.display();
		System.out.println("===========");
		
		Home home3=new Home(12, "both", OwnerName.KARTHIK_D_K, Floors.TWO, 3500, true);
		home3.display();
	}

}
