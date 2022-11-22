package com.xworkz.inheritance.boot.equalsBoot;

import com.xworkz.inheritance.equals.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		Hospital hospital=new Hospital();
		hospital.setCharges(650);
		hospital.setGood(false);
		hospital.setHospitalCode('H');
		hospital.setLocation("bengaluru");
		hospital.setMdName("madhavan");
		hospital.setName("apollo");
		hospital.setTotalBranches(125);
		hospital.setTotalRevenue(6523641L);
		hospital.setTotalStaffs(600);
		hospital.setType("multi-speciality");
		System.out.println(hospital);
		
		Hospital hospital2=new Hospital("people-tree", "eye-hospital", 800, 80, 'm', "ramesh", "hyderabad", 85652365L, false, 28);
		System.out.println(hospital2);
		
		boolean ref=hospital.equals(hospital2);
		System.out.println(ref);
	}

}
