package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.ClashOfClans;
import com.xworkz.rules.followers.ClanMembers;

public class ClashOfClansRunner {

	public static void main(String[] args) {
		ClanMembers clanMembers = new ClanMembers();
		clanMembers.accessing("camera roll");
		System.out.println(clanMembers.accessing("camera"));
		clanMembers.clanwars(24);
		clanMembers.connectingID(5);
		clanMembers.logOut("timegap");
		clanMembers.payment(449);
		clanMembers.signIn("jvallagi2834@gmail.com");

		System.out.println(clanMembers.toString());
		
		ClashOfClans clashOfClans=new ClanMembers();
		System.out.println(clashOfClans.accessing(null));
		System.out.println(clashOfClans.clanwars(0));
		System.out.println(clashOfClans.connectingID(0));
		System.out.println(clashOfClans.signIn(null));
		System.out.println(clashOfClans.payment(0));

	}

}
