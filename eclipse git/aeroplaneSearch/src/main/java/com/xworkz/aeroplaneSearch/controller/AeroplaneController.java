package com.xworkz.aeroplaneSearch.controller;

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

import com.xworkz.aeroplaneSearch.dto.AeroplaneDto;
import com.xworkz.aeroplaneSearch.service.AeroplaneService;

@Controller
@RequestMapping("/")
public class AeroplaneController {

	@Autowired
	private AeroplaneService aeroplaneService;
	public AeroplaneController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	private List<String> types = Arrays.asList("Commercial", "Business", "Cargo", "Difence", "economy");
	private List<String> countries = Arrays.asList("India", "USA", "arab", "japan", "China");

	@GetMapping("/aero")
	public String getRegister(Model model) {
		System.out.println("running in getMapping ");
		model.addAttribute("type", types);
		model.addAttribute("country", countries);
		return "Register";
	}

	@GetMapping("/aero")
	public String postRegister(Model model, AeroplaneDto dto) {
		Set<ConstraintViolation<AeroplaneDto>> violation=this.aeroplaneService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println(" no Violation in controller");
			model.addAttribute("reply", "Data Saved Sucessfully");
			model.addAttribute("type", types);
			model.addAttribute("country", countries);
			return "Register";

		}
		model.addAttribute("type", types);
		model.addAttribute("country", countries);
		model.addAttribute("errors", violation);
		model.addAttribute("messag", "Data is not Saved");
		return "Register";

	}

	@GetMapping("/search")
	public String getSearch(Model model, @RequestParam int id) {

		AeroplaneDto dto = this.aeroplaneService.findBy(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "Do not found ");
		}
		return "search";
	}
}
