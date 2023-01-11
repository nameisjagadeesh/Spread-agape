package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Jagadeesh {
	@Autowired   //here @Qualifier is not need bcz property name n bean name are same
	private String surname;
	@Autowired
	@Qualifier("ageOfJagadeesh")
	private int age;
	@Autowired
	@Qualifier("weightOfJagadeesh")
	private double weight;
	@Autowired
	@Qualifier("healthOfJagadeesh")
	private boolean healthy;
	@Autowired
	@Qualifier("numberOfJagadeesh")
	private long mobileNO;
	@Autowired
	@Qualifier("shoeNoOfJagadeesh")
	private short shoeNo;
	@Autowired
	@Qualifier("shirtSizeOfJagadeesh")
	private byte shirtSize;
	@Autowired
	@Qualifier("degreeOfJagadeesh")
	private String degree;
	@Autowired
	@Qualifier("ringSizeOfJagadeesh")
	private double ringSize;

	@Override
	public String toString() {
		return "Jagadeesh [surname=" + surname + ", age=" + age + ", weight=" + weight + ", healthy=" + healthy
				+ ", mobileNO=" + mobileNO + ", shoeNo=" + shoeNo + ", shirtSize=" + shirtSize + ", degree=" + degree
				+ ", ringSize=" + ringSize + "]";
	}

}
