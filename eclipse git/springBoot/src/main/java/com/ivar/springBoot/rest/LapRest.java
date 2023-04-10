package com.ivar.springBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LapRest {

	
	@GetMapping("/")
	public String onRun() {
		return "running the lapRest";
		
		
	}
}
