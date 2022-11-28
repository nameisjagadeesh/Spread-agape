package com.xworkz.rules.bridge;

public interface BwssbRules {
	boolean waterUsage(int liters);

	boolean waterBill(double bill);

	boolean waterloading(int load);

	boolean newConnection(String name);

	boolean sewageControl(boolean control);

}
