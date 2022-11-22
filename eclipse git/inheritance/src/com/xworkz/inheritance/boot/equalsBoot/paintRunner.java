package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.Paint;

public class paintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint();
		paint.setBrand("asian");
		paint.setCode('P');
		paint.setLifeSpan(25);
		paint.setName("royalpaint");
		paint.setPrice(650);
		paint.setQuantity(12);
		paint.setSticky(true);
		paint.setWeight(2.3);
		paint.setType("oilpaint");
		System.out.println(paint);

		Paint paint2 = new Paint("dry", 6.3, 'R', 20, false, "wintbow", 480, "zinta", 30);
		System.out.println(paint2);

		boolean ref=paint.equals(paint2);
		System.out.println(ref);
	}

}
