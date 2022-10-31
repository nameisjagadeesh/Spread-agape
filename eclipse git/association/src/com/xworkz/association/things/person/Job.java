package com.xworkz.association.things.person;

public class Job {
	public double salary;
	public String role;
	public int bond;
	public Company company;

	public Job(double salary, String role, int bond) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void show() {
		System.out.println("salary:" + salary);
		System.out.println("Job role:" + role);
		System.out.println("bond:" + bond);
		if (this.company != null) {
			// System.out.println(this.company);
			this.company.show();
		}
	}

}
