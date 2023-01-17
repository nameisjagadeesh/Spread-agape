package com.xworkz.springautowired.bean.interfacedAssn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.springautowired.rules.Browser;
import com.xworkz.springautowired.rules.Provider;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	public Chrome() {
		System.out.println("running the browser");
	}



	@Override
	public void browse() {
		System.out.println("browsing in the chrome via provider");
		provider.connects();
	}

}
