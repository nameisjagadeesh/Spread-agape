package com.xworkz.crudSpring.boots;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.crudSpring.configuration.SpringConfiguration;
import com.xworkz.crudSpring.dto.FirstAidDTO;
import com.xworkz.crudSpring.dto.MissileDTO;
import com.xworkz.crudSpring.dto.ResortDTO;
import com.xworkz.crudSpring.services.rule.FirstIAidService;
import com.xworkz.crudSpring.services.rule.MissileService;
import com.xworkz.crudSpring.services.rule.ResortService;

public class FirstAidRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		FirstIAidService firstAid = context.getBean(FirstIAidService.class);
		boolean saved = firstAid.validateAndSave(new FirstAidDTO());
		System.out.println("saved" + saved);

		System.out.println("~~~~~~~~~Running the MissileDto~~~~~~~~~~~");

		MissileService missile = context.getBean(MissileService.class);
		boolean save = missile.validateAndSave(new MissileDTO());
		System.out.println("savedMissile" + save);
		
		System.out.println("~~~~~~~~~Running the ResortDto~~~~~~~~~~~");

		ResortService resort = context.getBean(ResortService.class);
		boolean saving = resort.validateAndSave(new ResortDTO());
		System.out.println("savedMissile" + saving);
	}

}
