package com.xworkz.springautowired.boot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.springautowired")
@Configuration

public class AutowiredConfiguration {

	public AutowiredConfiguration() {
		System.out.println("started the AutowiredConfiguration");
	}

	@Bean
	public String surname() {
		return "Allagi"; // Or we can also do String string=new String("allagii")
	}

	@Bean
	public int ageOfJagadeesh() {
		return 26;
	}

	@Bean
	public double weightOfJagadeesh() {
		return 70.1;
	}

	@Bean
	public boolean healthOfJagadeesh() {
		return true;
	}

	@Bean
	public long numberOfJagadeesh() {
		return 7411833326L;
	}

	@Bean
	public short shoeNoOfJagadeesh() {
		return 8;
	}

	@Bean
	public byte shirtSizeOfJagadeesh() {
		return 40;
	}

	@Bean
	public String degreeOfJagadeesh() {
		return "Engineering";
	}

	@Bean
	public double ringSizeOfJagadeesh() {
		return 3.5;
	}

	@Bean
	public int id() {
		int ref = 32;
		return ref;
	}

	@Bean
	public String nameOfHardwareShop() {
		String string = new String("ganesh electronics");
		return string;
	}

	@Bean
	public String gstNoOfHardwareShop() {
		return "08AAAJM0351L1Z6";
	}

	@Bean
	public String ownerNameOfHardwareShop() {
		return "ganesh";
	}

	@Bean
	public String addressOfHardwareShop() {
		return "vijayanagar pipeline road";
	}

	@Bean
	public String nameOfSoftware() {
		return "Eclipse";
	}

	@Bean
	public double versionOfSoftware() {
		return 7.5;
	}

	@Bean
	public String developerOfSoftware() {
		return "Jagadeesh";
	}

	@Bean
	public String dateOfSoftware() {
		return "JAN 2012";
	}

	@Bean
	public boolean freeSoftware() {
		return true;
	}

	@Bean
	public String nameOfPencil() {
		return "nataraj";
	}

	@Bean
	public String typeOfPencil() {
		return "writing";
	}

	@Bean
	public double priceOfPencil() {
		double ref = 12.0;
		return ref;
	}

	@Bean
	public boolean sharp() {
		return true;
	}

	@Bean
	public boolean isStollen() {
		return false;
	}

	@Bean
	public String nameOfRubber() {
		return "apsara";
	}

	@Bean
	public String typeOfRubber() {
		return "erasing";
	}

	@Bean
	public double priceOfRubber() {
		return 6.5;
	}

	@Bean
	public String colorOfRubber() {
		return "white";
	}

	@Bean
	public String shapeOfRubber() {
		return "rectangle";
	}

	@Bean
	public boolean stollenRubber() {
		return true;
	}

	@Bean
	public char sizeOfRubber() {
		return 'M';
	}

	@Bean
	public String nameOfSoftwareEngg() {
		return "Jagadeesh";
	}

	@Bean
	public String companyName() {
		return "dexas soln pvt ltd";
	}

	@Bean
	public double salaryOfSoftwareEngg() {
		return 9.5 ;
	}
	@Bean
	public int expirienceOfSoftwareEngg() {
		return 3;
	}

}
