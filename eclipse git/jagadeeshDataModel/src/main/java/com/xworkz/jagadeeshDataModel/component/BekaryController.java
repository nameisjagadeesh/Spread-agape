package com.xworkz.jagadeeshDataModel.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.jagadeeshDataModel.dto.BakeryDto;
import com.xworkz.jagadeeshDataModel.service.BakeryService;

@Controller
@RequestMapping("/")
public class BekaryController {
	@Autowired
	private BakeryService bakeryService;
	public BekaryController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@GetMapping("/bakery")
	public String onBakery(BakeryDto dto,Model model) {
		System.out.println("running the onBakery method"+dto);
		boolean validated=this.bakeryService.validateAndSave(dto);
		System.out.println("validated"+validated);
		model.addAttribute("bakeDto", dto);
		return "BakerySuccess";
		
	}

}
