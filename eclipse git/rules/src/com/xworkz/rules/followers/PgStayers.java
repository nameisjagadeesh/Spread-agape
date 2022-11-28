package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.PgRules;

public class PgStayers implements PgRules{

	@Override
	public boolean payment(int price) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean membersAllowed(int members) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean security(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cityLimit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean restriction() {
		// TODO Auto-generated method stub
		return false;
	}

}
