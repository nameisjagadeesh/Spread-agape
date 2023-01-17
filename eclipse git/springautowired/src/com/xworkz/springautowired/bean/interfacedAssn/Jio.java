package com.xworkz.springautowired.bean.interfacedAssn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springautowired.rules.Browser;
import com.xworkz.springautowired.rules.Provider;

@Component
public class Jio implements Provider {
//	@Autowired
//	@Qualifier("chrome")
//	private Browser browsing2;

	public Jio() {
		System.out.println("running the Jio");
	}

	@Override
	public void connects() {
		System.out.println("Running the jio via browsing 2");
		//browsing2.browse();
	}

}
