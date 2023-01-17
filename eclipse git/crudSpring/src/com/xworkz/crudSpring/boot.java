package com.xworkz.crudSpring;

import com.xworkz.crudSpring.dto.SoftwareDTO;
import com.xworkz.crudSpring.services.SoftwareServiceImpl;
import com.xworkz.crudSpring.services.rule.SoftwareService;

public class boot {

	public static void main(String[] args) {
		SoftwareDTO dto = new SoftwareDTO();

		dto.setCompany("Dell and hp");
		dto.setDeveloperName("Jagadeesh");
		dto.setName("eclipse");
		dto.setPrice(15652);
		dto.setSize(1000);
		System.out.println(dto);
		
		SoftwareService service=new SoftwareServiceImpl();
		service.develop(dto);
		
	}

}
