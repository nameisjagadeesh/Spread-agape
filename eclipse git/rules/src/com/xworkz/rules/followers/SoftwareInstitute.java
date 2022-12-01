package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.DevelopementInstitute;
import com.xworkz.rules.bridge.GroupsRules;
import com.xworkz.rules.bridge.Institute;
import com.xworkz.rules.bridge.TestingInstitute;
import com.xworkz.rules.bridge.Xworks;

public class SoftwareInstitute implements Institute, DevelopementInstitute, TestingInstitute, Xworks, GroupsRules {

	@Override
	public String attendence() {
		// TODO Auto-generated method stub
		System.out.println("Running the attendence");
		return null;
	}

	@Override
	public String plays() {
		// TODO Auto-generated method stub
		System.out.println("Running the plays");
		return null;
	}

	@Override
	public String discipline() {
		System.out.println("Running the discpline");
		return null;
	}

	@Override
	public String outings() {
		System.out.println("Running the outings");
		return null;
	}

	@Override
	public String sports() {
		System.out.println("Running the sports");
		return null;
	}

	@Override
	public boolean tasks() {
		System.out.println("Running the tasks");
		return false;
	}

	@Override
	public void interview() {
		System.out.println("Running the interview");
	}

	@Override
	public boolean hackathon() {
		System.out.println("Running the hackathon");
		return false;
	}

	@Override
	public boolean training() {
		System.out.println("Running the training");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("Running the placement");
		return false;
	}

	@Override
	public double trainingPeriod() {
		System.out.println("Running the trainingPeriod");
		return 0;
	}

}
