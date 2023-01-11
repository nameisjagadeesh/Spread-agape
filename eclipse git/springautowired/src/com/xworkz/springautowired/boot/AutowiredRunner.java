package com.xworkz.springautowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springautowired.bean.HardwareShop;
import com.xworkz.springautowired.bean.Jagadeesh;
import com.xworkz.springautowired.bean.Pencil;
import com.xworkz.springautowired.bean.Rubber;
import com.xworkz.springautowired.bean.Software;
import com.xworkz.springautowired.bean.SoftwareEngineer;

public class AutowiredRunner {

	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] beanNames = container.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanNames));
		System.err.println("~~~~~Jagadeesh~~~~~~");
		Jagadeesh refOfJagadeesh = container.getBean(Jagadeesh.class);
		System.out.println(refOfJagadeesh.toString());
		System.err.println("~~~~~~~HardwareShop~~~~~~~~");
		HardwareShop refOfShop = container.getBean(HardwareShop.class);
		System.out.println(refOfShop.toString());
		System.err.println("~~~~~~~software~~~~~~~~");
		Software refOfSoftware = container.getBean(Software.class);
		System.out.println(refOfSoftware.toString());
		System.err.println("~~~~~~~pencil~~~~~~~~");
		Pencil refOfPencil = container.getBean(Pencil.class);
		System.out.println(refOfPencil.toString());
		System.err.println("~~~~~~~Rubber~~~~~~~~");
		Rubber refOfRubber = container.getBean(Rubber.class);
		System.out.println(refOfRubber.toString());
		System.err.println("~~~~~~~softwareEngineer~~~~~~~~");
		SoftwareEngineer refOfEngineer = container.getBean(SoftwareEngineer.class);
		System.out.println(refOfEngineer.toString());
	}

}
