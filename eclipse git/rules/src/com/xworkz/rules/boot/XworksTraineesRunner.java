package com.xworkz.rules.boot;

import com.xworkz.rules.bridge.Xworkz;
import com.xworkz.rules.followers.XworksTrainees;

public class XworksTraineesRunner {

	public static void main(String[] args) {
		XworksTrainees trainees = new XworksTrainees();
		System.out.println(trainees.fees(0));
		System.out.println(trainees.placements(0));
		System.out.println(trainees.trainers(null));
		System.out.println(trainees.tasks(null));
		System.out.println(trainees.schedule());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Xworkz trainees1 = new XworksTrainees();
		System.out.println(trainees1.fees(0));
		System.out.println(trainees1.placements(0));
		System.out.println(trainees1.trainers(null));
		System.out.println(trainees1.tasks(null));
		System.out.println(trainees1.schedule());
	}

}
