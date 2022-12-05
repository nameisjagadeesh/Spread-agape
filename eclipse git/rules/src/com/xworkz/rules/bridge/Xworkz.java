package com.xworkz.rules.bridge;

public interface Xworkz {
	boolean schedule();

	boolean fees(double fees);

	boolean trainers(String name);

	boolean placements(int totalPlacemts);

	boolean uploadedTasks(String names);
	
	boolean completedProgram();

}
