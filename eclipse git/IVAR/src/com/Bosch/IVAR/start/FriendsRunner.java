package com.Bosch.IVAR.start;

public class FriendsRunner {

	public static void main(String[] args) {
		System.out.println("accessing the friends");
		Friends.save("manjunath");
		Friends.save("somnath");
		Friends.save("IVARs");
		Friends.save("sangamesh");

		Friends.display();

	}

}
