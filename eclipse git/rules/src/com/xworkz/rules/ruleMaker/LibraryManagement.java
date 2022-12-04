package com.xworkz.rules.ruleMaker;

import com.xworkz.rules.bridge.LibraryRules;

public class LibraryManagement {
	private LibraryRules libraryRules;

	public LibraryManagement(LibraryRules libraryRules) {
		this.libraryRules = libraryRules;
	}

	public void readCheck() {
		if (this.libraryRules != null) {
			System.out.println("running the readcheck");
			boolean silence = this.libraryRules.keepSilence();
			int seat = this.libraryRules.seatCapacity();
			if (silence && seat >= 50) {
				System.out.println("library is following the rules");
			} else {
				System.err.println("library is not following the rules");

			}
		}
	}

}
