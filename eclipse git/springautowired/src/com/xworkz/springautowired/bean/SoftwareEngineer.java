package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	@Autowired()
	@Qualifier("nameOfSoftwareEngg")
	private String name;
	@Autowired()
	@Qualifier("salaryOfSoftwareEngg")
	private double salary;
	@Autowired()
	// @Qualifier("nameOfHardwareShop")
	private String companyName;
	@Autowired()
	@Qualifier("expirienceOfSoftwareEngg")
	private int yearsOfExperiance;

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", yearsOfExperiance=" + yearsOfExperiance + "]";
	}

}
