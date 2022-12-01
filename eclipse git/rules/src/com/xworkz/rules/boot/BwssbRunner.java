package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.BwssbRules;
import com.xworkz.rules.followers.BwwsbUsers;

public class BwssbRunner {

	public static void main(String[] args) {
		BwwsbUsers users = new BwwsbUsers();
		System.out.println(users.newConnection(null));
		System.out.println(users.sewageControl(false));
		System.out.println(users.waterBill(0));
		System.out.println(users.waterUsage(0));
		System.out.println(users.waterloading(0));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		BwssbRules users2 = new BwwsbUsers();
		System.out.println(users2.newConnection(null));
		System.out.println(users2.sewageControl(false));
		System.out.println(users2.waterBill(0));
		System.out.println(users2.waterUsage(0));
		System.out.println(users2.waterloading(0));
	}
}
