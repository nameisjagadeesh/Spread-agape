package com.xworkz.rules.bridge;

public interface BescomRules {
	int priceList(double price);

	int unitLimit(int limit);

	int deadlines(String line);

	int overloading(int fine);

	int taxes(long revenue);

}
