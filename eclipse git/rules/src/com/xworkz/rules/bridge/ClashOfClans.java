package com.xworkz.rules.bridge;

public interface ClashOfClans {

	public boolean connectingID(int id);

	public boolean signIn(String name);

	public boolean payment(double price);

	public	boolean accessing(String camera);

	public boolean logOut(String reason);

	public boolean clanwars(int totalWars);

}
