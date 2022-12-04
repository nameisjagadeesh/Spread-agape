package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.LibraryRules;
import com.xworkz.rules.followers.ReadersInLibrary;
import com.xworkz.rules.ruleMaker.LibraryManagement;

public class LibraryRunner {

	public static void main(String[] args) {
		ReadersInLibrary readersInLibrary = new ReadersInLibrary();
		LibraryManagement management = new LibraryManagement(readersInLibrary);
		management.readCheck();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		LibraryRules libraryRules = new ReadersInLibrary();
		LibraryManagement management2 = new LibraryManagement(libraryRules);
		management2.readCheck();
	}

}
