package com.xworkz.access.boot;

import com.xworkz.access.things.ChainRing;
import com.xworkz.access.things.Ring;

public class ChainRunner {

	public static void main(String[] args) {
		ChainRing chainRing=new ChainRing();
		Ring ring=new Ring();
		System.out.println(chainRing.brand);
		System.out.println(chainRing.ring);
		System.out.println(ring.getCode());
		System.out.println(ring.getColor());
		System.out.println(ring.getName());
		System.out.println(ring.getPrice());
		System.out.println(ring.getType());
		System.out.println(ring.isHard());
		System.out.println(ring.getWeight());
		System.out.println(ring.getCompany());
		System.out.println(ring.getRingTag());
		System.out.println(ring.getCompany());
		System.out.println(ring.getQuantity());
		chainRing.wear();
	}

}
