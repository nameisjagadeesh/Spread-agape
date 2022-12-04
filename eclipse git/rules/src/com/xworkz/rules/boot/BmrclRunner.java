package com.xworkz.rules.boot;

import com.xworkz.rules.followers.BmrclStafs;
import com.xworkz.rules.ruleMaker.BmrclManagement;

public class BmrclRunner {
	public static void main(String[] args) {
		BmrclStafs bmrclStafs = new BmrclStafs();

		BmrclManagement bmrclManagement = new BmrclManagement(bmrclStafs); //this is abstraction
		bmrclManagement.bmrclTrain();
		
	}

	
	

}
