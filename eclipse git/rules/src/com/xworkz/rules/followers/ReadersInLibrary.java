package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.LibraryRules;

public class ReadersInLibrary implements LibraryRules {

	@Override
	public boolean keepSilence() {
		System.out.println("running the keepsilence");
		return false;
	}

	@Override
	public int seatCapacity() {
		System.out.println("running the seatcapacity");
		return 28;
	}

}
