package com.xworkz.attributeSpring.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.attributeSpring.dto.BeachDto;

@Component
@RequestMapping("/beach")
public class BeachController {
	public BeachController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}
	@GetMapping
	public String enjoyBeaches(BeachDto beachDto,Model model) {
		System.out.println("running enjoyBeaches"+beachDto);
		model.addAttribute("name", beachDto.getName());
		model.addAttribute("location", beachDto.getLocation());
		model.addAttribute("game", beachDto.getGame());

		return "BeachSuccess.jsp";
		
	}

}
