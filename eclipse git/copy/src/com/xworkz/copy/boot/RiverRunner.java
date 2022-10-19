package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class RiverRunner {

	public static void main(String[] args) {
		System.out.println("now accessing all details using the methods");
		byte tributaries=5;//for byte explicit value
	    short places=69;//for short explicit value
		String[] names= {"ganga","tunga","sanga","manga","pinga"};
		String[] countries= {"india","pak","afg","lanka","bangla"};
	    String[] states= {"ka","tn","up","mp","ap"};
	    String[] animals= {"elephant","tiger","lion","liger","tion"};
	    String[] plants= {"neem","tulsi","banyan","mango","apple"};
	    String[] stones= {"red","white","black","violet","dark"};
	    
	    
	    River river=new River("indus", 96F, "uttarakhand", tributaries, places, names, countries, states, animals, plants, stones);
	    river.displayDetails();
	}

}
