package com.xworkz.inheritance.boot.equalsBoot;

public class StringRunner {

	public static void main(String[] args) {
		

		String name = "ivar the legend";
		System.out.println(name);
		name = name + "2834";
		System.out.println(name);
		String concated = name.concat(" vikings"); // string method 1
		System.out.println(concated);
		System.out.println("~~~~~~~~~~~~~~");

		int ref = concated.charAt(25); // string method 2
		System.out.println(ref);
		System.out.println("~~~~~~~~~~~~~~");

		int ref1 = concated.codePointAt(2); // string method 3
		System.out.println(ref1);
		System.out.println("~~~~~~~~~~~~~~");

		boolean ref2 = name.contains(name); // string method 4
		System.out.println(ref2);
		System.out.println("~~~~~~~~~~~~~~");

		int ref3 = name.codePointBefore(2); // string method 5
		System.out.println(ref3);
		System.out.println("~~~~~~~~~~~~~~");

		int ref4 = concated.codePointCount(3, 13); // string method 6
		System.out.println(ref4);
		System.out.println("~~~~~~~~~~~~~~");

		int ref5 = name.compareTo(concated); // string method 7
		System.out.println(ref5);
		System.out.println("~~~~~~~~~~~~~~");

		int ref6 = name.compareToIgnoreCase(name); // string method 8
		System.out.println(ref6);
		System.out.println("~~~~~~~~~~~~~~");

		boolean ref7 = name.contentEquals(concated); // string method 9
		System.out.println(ref7);
		System.out.println("~~~~~~~~~~~~~~");

		boolean ref8 = concated.contentEquals(name); // string method 10
		System.out.println(ref8);
		System.out.println("~~~~~~~~~~~~~~");

		byte[] ref9 = concated.getBytes(); // string method 11
		System.out.println(ref9);
		System.out.println("~~~~~~~~~~~~~~");

		byte[] a = concated.getBytes(); // string method 12
		System.out.println(a);
		System.out.println("~~~~~~~~~~~~~~");

		byte[] b = concated.getBytes(); // string method 13
		System.out.println(b);
		System.out.println("~~~~~~~~~~~~~~");

		int c = concated.hashCode(); // string method 14
		System.out.println(c);
		System.out.println("~~~~~~~~~~~~~~");

		int d = name.indexOf(1); // string method 15
		System.out.println(d);
		System.out.println("~~~~~~~~~~~~~~");

		int e = name.indexOf(concated); // string method 16
		System.out.println(e);
		System.out.println("~~~~~~~~~~~~~~");

		int f = name.indexOf(c, e); // string method 17
		System.out.println(f);
		System.out.println("~~~~~~~~~~~~~~");

		String g = name.intern(); // string method 18
		System.out.println(g);
		System.out.println("~~~~~~~~~~~~~~");

		boolean h = name.isEmpty(); // string method 19
		System.out.println(h);
		System.out.println("~~~~~~~~~~~~~~");

		int i = name.length(); // string method 20
		System.out.println(i);
		System.out.println("~~~~~~~~~~~~~~");

		boolean j = concated.matches(concated); // string method 21
		System.out.println(j);
		System.out.println("~~~~~~~~~~~~~~");

		String k = concated.replace("hi", "bye"); // string method 22
		System.out.println(k);
		System.out.println("~~~~~~~~~~~~~~");

		String[] l = name.split("jagadeesh"); // string method 23
		System.out.println(l);
		System.out.println("~~~~~~~~~~~~~~");

		String m = concated.toUpperCase(); // string method 24
		System.out.println(m);
		System.out.println("~~~~~~~~~~~~~~");

		String n = concated.trim(); // string method 25
		System.out.println(n);
		System.out.println("~~~~~~~~~~~~~~");

		String o = concated.toLowerCase(); // string method 26
		System.out.println(o);
		System.out.println("~~~~~~~~~~~~~~");

	}

}
