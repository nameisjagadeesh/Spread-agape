package com.xworkz.springautowired.bean.interfacedAssn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springautowired.rules.Browser;
import com.xworkz.springautowired.rules.Provider;
@Component
public class Airtel implements Provider {
//	@Autowired
//	@Qualifier("firebox")
//	private Browser browsing;
	
public Airtel() {
	System.out.println("running the Airtel");	}
	

	@Override
	public void connects() {
		System.out.println("running the Aiirtel via browse");
		//browsing.browse();
	}

	

}
