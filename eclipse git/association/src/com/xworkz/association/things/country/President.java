package com.xworkz.association.things.country;

import com.xworkz.association.constants.Gender;
//this code is on association which relates one to one variable and one to many variables (array)

public class President {
	public String name;
	public double tenure = 5;
	public long totalVotes;
	public Gender gender;

	public President(String name) {
		super();
		this.name = name;
	}

	public void setGender(Gender gender) { //this is method initialisation
		this.gender = gender;
	}

	public void setTotalVotes(long totalVotes) {//this is method initialisation
		this.totalVotes = totalVotes;
	}

	public void details() {
		System.out.println(this.name);
		System.out.println(this.tenure);
		System.out.println(this.totalVotes);
		if(this.gender!=null) { //this to check null point exeptioner
		System.out.println(this.gender);
		}
		else {
			System.out.println("the gender is null");
		}
	}

}
