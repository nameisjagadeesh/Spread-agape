package com.xworkz.module.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.module.service.ModuleService;

import lombok.extern.slf4j.Slf4j;

@RestController
@EnableWebMvc
@RequestMapping("/")
@Slf4j
public class ModuleAjaxController {

	@Autowired
	private ModuleService moduleService;

	public ModuleAjaxController() {
		log.info("created" + getClass().getSimpleName());
	}

	@GetMapping(value = "/userId/{user}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onUser(@PathVariable String user) {
		Long u = this.moduleService.findByUser(user);
		log.info("user" + u);
		if (u == 0) {
			return "";
		} else {
			return "UserId is already exist ,kindly choose another one";
		}

	}

	@GetMapping(value = "/userEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onEmail(@PathVariable String email) {
		Long e = this.moduleService.findByEmail(email);
		if (e == 0) {
			return "";
		} else {
			return "Email is already exist ,kindly choose another one";
		}
	}

	@GetMapping(value = "/userNumber/{number}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String onNumber(@PathVariable Long number) {
		Long n = this.moduleService.findByNumber(number);
		if (n == 0) {
			return "";
		} else {
			return "Number is already exist ,kindly choose another one";
		}
	}

	@GetMapping(value = "/reemail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String reEmail(@PathVariable String email) {
		Long mail = this.moduleService.findByEmail(email);
		log.info("emails" + mail);

		if (mail == 0) {
			return "Kindly Enter the exisiting email";
		} else {
			return " ";
		}
	}
}
