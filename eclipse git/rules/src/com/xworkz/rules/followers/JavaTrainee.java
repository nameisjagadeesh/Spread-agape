package com.xworkz.rules.followers;

import com.xworkz.rules.bridge.Xworkz;

public class JavaTrainee extends Person implements Xworkz {

	@Override
	public boolean schedule() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean fees(double fees) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean trainers(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean placements(int totalPlacemts) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean uploadedTasks(String names) {
		System.out.println("running uploaded task from java trainee");
		return false;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completed program from java trainee");
		return false;
	}
	
	public void training() {
		System.out.println("running training from java trainee");
	}
	
	public void executedProgram() {
		System.out.println("running executedProgram from java trainee");
	}
	

}
