package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.BankRules;
import com.xworkz.rules.followers.BankAccountHolders;

public class BankAccountHoldersRunner {

	public static void main(String[] args) {
		BankAccountHolders accountHolders=new BankAccountHolders();
		System.out.println(accountHolders.accountType());
		System.out.println(accountHolders.branches());
		System.out.println(accountHolders.closingTime());
		System.out.println(accountHolders.opening());
		System.out.println(accountHolders.transactionLimit());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		BankRules bankRules=new BankAccountHolders();
		System.out.println(bankRules.accountType());
		System.out.println(bankRules.branches());
		System.out.println(bankRules.closingTime());
		System.out.println(bankRules.opening());
		System.out.println(bankRules.transactionLimit());
		
		
		
	}

}
