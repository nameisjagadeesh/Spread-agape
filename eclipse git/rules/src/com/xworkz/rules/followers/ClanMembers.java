package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.ClashOfClans;

public class ClanMembers implements ClashOfClans {

	@Override
	public boolean connectingID(int id) {
		return false;
	}

	@Override
	public boolean signIn(String name) {
		return false;
	}

	@Override
	public boolean payment(double price) {
		return false;
	}

	@Override
	public boolean accessing(String camera) {
		return true;
	}

	@Override
	public boolean logOut(String reason) {
		return false;
	}

	@Override
	public boolean clanwars(int totalWars) {
		return false;
	}

}
