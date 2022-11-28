package com.xworkz.rules.bridge;

public interface BankRules {
	boolean opening();

	boolean closingTime();

	boolean transactionLimit();

	boolean accountType();

	boolean branches();

}
