package com.xworkz.module.controller;

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

import com.xworkz.module.dto.ModuleDTO;
import com.xworkz.module.service.ModuleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class ModuleController {

	@Autowired
	private ModuleService moduleService;

	public ModuleController() {
		log.info("created" + this.getClass().getName());
	}

	@GetMapping("/modules")
	public String onSave(Model model) {

		log.info("running get onSave method");
		return "SignUp";
	}
	
	
	
	@PostMapping("/modules")
	public String onSave(Model model, ModuleDTO dto) {
		log.info("running onSave in controller");
//		List<ModuleDTO> listDto=this.moduleService.findAll();
//		for (ModuleDTO moduleDTO : listDto) {
//			if(dto.getUserId().equals(moduleDTO.getUserId())) {
//				model.addAttribute("userIdExist", "UserId already exists");
//				return "SignUp";
//			} else if (dto.getEmail().equals(moduleDTO.getEmail())) {
//				model.addAttribute("userEmailExist", "UserEmail already exists");
//				return "SignUp";
//			} 
//			else if (dto.getNumber().equals(moduleDTO.getNumber())) {
//				model.addAttribute("userNumberExist", "UserNumber already exists");
//				return "SignUp";
//			}
					
		
	//	if (dto.getPassword().equals(dto.getConfirmPassword())) {
			Set<ConstraintViolation<ModuleDTO>> violations = this.moduleService.validateAndSave(dto);
			if (violations.isEmpty()) {
				log.info("no violations are in dto");
				model.addAttribute("message", "SignUp Saved SuccessFully");
				return "SignUp";
			}
			model.addAttribute("error", violations);
			model.addAttribute("messages", "errors are there data not saved");
			//model.addAttribute("password", "password and confirmPassword must be same");
		//}
		
	
		return "SignUp";

}
	
	@GetMapping("/sign")
	public String onSign(String userId,String password,Model model) {
		log.info("user"+userId);
		log.info("password"+password);
		log.info("running the onSign in controller");
		try {
			ModuleDTO mDto=this.moduleService.signIn(userId, password);
			log.info("DTO--"+mDto);
			if(mDto.getSignInCount()>=3) {
				
				model.addAttribute("lock", "Account has been locked due wrong credentials");				
				return "SignIn";
			}
				if(mDto!=null) {
					if(mDto.getPasswordReset()==true) {
						model.addAttribute("user", mDto.getUserId());
						return "UpdatePassword";
					}
					log.info("password and userId matched");
					model.addAttribute("user", mDto.getUserId());
					return "SignInSuccess";
					
				}
			
		} catch (Exception e) {
			log.info(""+e.getMessage());
		}
		
		
		model.addAttribute("fail", "userId n password is not matched ");
		return "SignIn";
	}
	
	@PostMapping("/set")
	public String onReset(@RequestParam String email,Model model) {
		
		ModuleDTO reset=this.moduleService.resetPass(email);
		if(reset.getPasswordReset()==true) {
				model.addAttribute("reset", "password sent the given mail ,login again");
				return "PassReset";
		}
		return "PassReset";
	}

	@PostMapping("passUpdate")
	public String onUpdate(String userId,String password,String confirmPassword,Model model) {
		this.moduleService.updatePass(userId, password, confirmPassword);
		//model.addAttribute("update", "Password updated successfully");
		return "PassUpdateSuccess";
	}
	}
