package com.xworkz.valantineValidation.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.valantineValidation.dto.ValentineDTO;
import com.xworkz.valantineValidation.service.ValentineService;

@Controller
@RequestMapping("/")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;
	
	private	List<String> places = Arrays.asList("Park", "Hotel", "Hemple", "Office", "Garden", "MG Road", "Home");
	private	List<String> gifts = Arrays.asList("Toys", "iphone", "ipad", "chocolate", "teddy", "Dress", "saree");

	public ValentineController() {
		System.out.println("created " + this.getClass().getSimpleName());

	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running the onSearch");
		ValentineDTO dto= this.valentineService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto", dto);
		}
		else {
			model.addAttribute("message", "Data Not Found Enter proper Id");
		}
		return "ValentineSearch";
	}
	@GetMapping("/valentine")
	public String onValantine(Model model) {
		System.out.println("running onValantine method");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "Valantine";
	}

	@PostMapping("/valentine")
	public String onValantine(Model model, ValentineDTO dto) {
		System.out.println("onValantine method in post" + dto);
		Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation are in dto");
			return "ValantineSuccess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("error", violations);
		model.addAttribute("dto", dto);
		System.out.println("errors are in the violations");
		return "Valantine";
	}
}
