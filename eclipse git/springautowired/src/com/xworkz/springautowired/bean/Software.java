package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	@Autowired()
	@Qualifier("nameOfSoftware")
	private String name;
	@Autowired()
	@Qualifier("versionOfSoftware")
	private double version;
	@Autowired()
	@Qualifier("developerOfSoftware")
	private String developer;
	@Autowired()
	@Qualifier("dateOfSoftware")
	private String date;
	@Autowired()
	@Qualifier("freeSoftware")
	private boolean free;
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}

}
