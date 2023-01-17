package com.xworkz.springautowired.bean.interfacedAssn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springautowired.rules.Browser;
import com.xworkz.springautowired.rules.Provider;

@Component
public class Firebox implements Browser {

	@Autowired
	@Qualifier("jio")
	private Provider provider2;

	public Firebox() {
		System.out.println("running the firebox");
	}

	@Override
	public void browse() {
		System.out.println("running the browser via provider 2");
		provider2.connects();
	}

}
