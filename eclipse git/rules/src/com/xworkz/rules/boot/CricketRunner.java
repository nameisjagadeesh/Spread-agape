package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.CricketRules;
import com.xworkz.rules.followers.CricketPlayers;

public class CricketRunner {

	public static void main(String[] args) {
		CricketPlayers cricketPlayers = new CricketPlayers();
		System.out.println(cricketPlayers.coaches(0));
		System.out.println(cricketPlayers.committes(0));
		System.out.println(cricketPlayers.countryAllowed(0));
		System.out.println(cricketPlayers.grounds(0));
		System.out.println(cricketPlayers.players(0));
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		CricketRules cricketPlayers2 = new CricketPlayers();
		System.out.println(cricketPlayers2.coaches(0));
		System.out.println(cricketPlayers2.committes(0));
		System.out.println(cricketPlayers2.countryAllowed(0));
		System.out.println(cricketPlayers2.grounds(0));
		System.out.println(cricketPlayers2.players(0));
	}

}
