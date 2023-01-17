package com.xworkz.springautowired.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springautowired.bean.interfacedAssn.Chrome;
import com.xworkz.springautowired.bean.interfacedAssn.Firebox;
import com.xworkz.springautowired.configuration.BrowserConfiguration;

public class BrowserRunner {

	public static void main(String[] args) {
		ApplicationContext container=new AnnotationConfigApplicationContext(BrowserConfiguration.class);
		Chrome provide= container.getBean(Chrome.class);
		provide.browse();
		Firebox provide2= container.getBean(Firebox.class);
		provide2.browse();
		
		System.out.println("~~~~~~~~~~~~~~~~~~");
		
//		Airtel airtel=container.getBean(Airtel.class);
//		airtel.connects();
//		Jio jio=container.getBean(Jio.class);
//		jio.connects();
	}

}
