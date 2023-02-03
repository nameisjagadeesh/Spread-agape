package com.xworkz.attributeSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.attributeSpring.dto.CasinoDto;

@Component
@RequestMapping("/casino")
public class CasinoController {

	public CasinoController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	
	@GetMapping
	public String gamble(CasinoDto dto,Model model) {
		System.out.println("running the gamble method "+dto);
		model.addAttribute("name",dto.getName());
		model.addAttribute("cruise",dto.getCruise());
		model.addAttribute("entryFees",dto.getEntryFees());

		return "CasinoSuccess.jsp";
		
		
	}

}
