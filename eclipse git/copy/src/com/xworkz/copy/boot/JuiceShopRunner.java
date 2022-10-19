package com.xworkz.copy.boot;
import com.xworkz.copy.examples.*;

public class JuiceShopRunner {

	public static void main(String[] args) {
		String[] juiceType = { "watermelon", "Pinapple", "apple", "Sapota", "Milkshakes" };
		String[] iteam = { "Mixer", "Mixerjar", "Glass", "Counter", "etc......" };
		String[] workersName = { "khan", "sanju", "karthi" };
		String[] Fruite = { "watermelon", "dragonFruit", "apple", "Sapota","pineapple" };
		int[] rate = { 30, 40, 65, 50, 80, 90 };
		String[] iceCream = { "americanNuts", "Butterscoth", "Venila",  };
		JuiceShop shop=new JuiceShop("takeitEasy", "mahesh", 652, 12, 6, juiceType, iteam, workersName, Fruite,
				rate, iceCream);
		shop.reading();
	}

}
