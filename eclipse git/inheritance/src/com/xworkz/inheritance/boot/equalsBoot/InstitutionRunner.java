package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institution=new Institution();
		institution.setCode('I');
		institution.setFees(3654598L);
		institution.setGood(true);
		institution.setLocation("mumbai");
		institution.setName("IIT");
		institution.setPrincipalName("ramesh");
		institution.setTotalBranches(65);
		institution.setTotalRevenue(854566988L);
		institution.setTotalStaffs(250);
		institution.setType("technology based");
		System.out.println(institution);
		
		Institution institution2=new Institution("IIM", "management", 85460L, 125, 'i', "bharatkumar", "delhi", 4521365L, false, 10);
		System.out.println(institution2);
		boolean ref=institution.equals(institution2);
		System.out.println(ref);
	}

}
