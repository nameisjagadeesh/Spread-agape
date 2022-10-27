package com.xworkz.association.boot;

import com.xworkz.association.constants.Shape;
import com.xworkz.association.things.Pillar;

public class PillarRunner {

	public static void main(String[] args) {
		Pillar pillar=new Pillar(2834, "bengaluru", Shape.CYLINDRICAL, 39, "l&t");
		pillar.showThings();
	}

}
