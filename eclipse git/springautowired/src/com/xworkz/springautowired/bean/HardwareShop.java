package com.xworkz.springautowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired()
	private int id;
	@Autowired()
	@Qualifier("nameOfHardwareShop")
	private String name;
	@Autowired()
	@Qualifier("gstNoOfHardwareShop")
	private String gstNo;
	@Autowired()
	@Qualifier("ownerNameOfHardwareShop")
	private String ownerName;
	@Autowired()
	@Qualifier("addressOfHardwareShop")
	private String address;

	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}

}
