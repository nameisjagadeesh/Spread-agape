package com.xworkz.missiles.resource;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.missiles.dto.MissileDto;
import com.xworkz.missiles.service.MissileService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j // logger used instead of sop
@RequestMapping("/")
@EnableWebMvc
public class AjaxResource {

	@Autowired
	private MissileService missileService;

	public AjaxResource() {
		//System.out.println("created " + this.getClass().getSimpleName());
		log.info("created " + this.getClass().getSimpleName());
	}

	@GetMapping(value = "/call", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onData() {

		//System.out.println("running the onData in AjaxResource");
		log.info("running the onData in AjaxResource");

		return "printing this message of ajax via onData  method";
	}

	@GetMapping(value = "/dto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public MissileDto onDto(@PathVariable int id) {
		//System.out.println("register onDto in AjaxReource" + id);
		log.info("register onDto in AjaxReource" + id);
		MissileDto dto = missileService.findById(id);
		return dto;
	}
}
