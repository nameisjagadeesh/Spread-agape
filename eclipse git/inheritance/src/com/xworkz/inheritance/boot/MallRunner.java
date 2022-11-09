package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Mall;
import com.xworkz.inheritance.things.childclass.Orion;

public class MallRunner {

	public static void main(String[] args) {
		Mall mall = new Orion("bengaluru", 200, "asian");
		mall.shopping();

		Orion orion = new Orion("kerala", 156, "asian");
		orion.shopping();
	}

}
