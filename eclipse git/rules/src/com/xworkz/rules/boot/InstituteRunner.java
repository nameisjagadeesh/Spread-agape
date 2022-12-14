package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.DevelopementInstitute;
import com.xworkz.rules.bridge.GroupsRules;
import com.xworkz.rules.bridge.Institute;
import com.xworkz.rules.bridge.TestingInstitute;
import com.xworkz.rules.bridge.Xworks;
import com.xworkz.rules.followers.GroupedPeoples;
import com.xworkz.rules.followers.SoftwareInstitute;

public class InstituteRunner {

	public static void main(String[] args) {
		SoftwareInstitute softwareInstitute = new SoftwareInstitute();
		softwareInstitute.attendence();
		softwareInstitute.discipline();
		softwareInstitute.hackathon();
		softwareInstitute.interview();
		softwareInstitute.outings();
		softwareInstitute.plays();
		softwareInstitute.sports();
		softwareInstitute.tasks();
		softwareInstitute.training();
		softwareInstitute.trainingPeriod();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Institute institute = new SoftwareInstitute();
		institute.placement();
		institute.training();
		institute.trainingPeriod();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		DevelopementInstitute developementInstitute = new SoftwareInstitute();
		developementInstitute.hackathon();
		developementInstitute.placement();
		developementInstitute.training();
		developementInstitute.trainingPeriod();
		developementInstitute.placement();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		TestingInstitute testingInstitute = new SoftwareInstitute();
		testingInstitute.interview();
		testingInstitute.placement();
		testingInstitute.training();
		testingInstitute.trainingPeriod();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Xworks xworks = new SoftwareInstitute();
		xworks.hackathon();
		xworks.interview();
		xworks.placement();
		xworks.tasks();
		xworks.training();
		xworks.trainingPeriod();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		GroupsRules groupsRules = new SoftwareInstitute();
		groupsRules.attendence();
		groupsRules.discipline();
		groupsRules.outings();
		groupsRules.plays();
		groupsRules.sports();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		
		GroupsRules groupsRules2=new GroupedPeoples();
		groupsRules2.attendence();
		groupsRules2.discipline();
		groupsRules2.outings();
		groupsRules2.plays();
		groupsRules2.sports();
		
		

	}

}
