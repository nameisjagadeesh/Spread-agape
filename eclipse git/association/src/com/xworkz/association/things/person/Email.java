package com.xworkz.association.things.person;

public class Email {
	public String id;
	public String password;
	public long mobileNo;
	public Company company;

	public Email(String id, String password, long mobileNo) {
		super();
		this.id = id;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void show() {
		System.out.println("Emailid:" + id);
		System.out.println("password:" + password);
		System.err.println("Contact:" + mobileNo);
		if (this.company != null) {
			this.company.show();
		}
	}

}
