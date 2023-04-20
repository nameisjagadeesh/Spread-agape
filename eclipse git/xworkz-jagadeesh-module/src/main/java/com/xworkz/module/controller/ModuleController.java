package com.xworkz.module.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.ConstraintViolation;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.module.dto.ModuleDTO;
import com.xworkz.module.entity.TechnologiesEntity;
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

		// if (dto.getPassword().equals(dto.getConfirmPassword())) {
		Set<ConstraintViolation<ModuleDTO>> violations = this.moduleService.validateAndSave(dto);
		if (violations.isEmpty()) {
			log.info("no violations are in dto");
			model.addAttribute("message", "SignUp Saved SuccessFully");
			return "SignUp";
		}
		model.addAttribute("error", violations);
		model.addAttribute("messages", "errors are there data not saved");
		// model.addAttribute("password", "password and confirmPassword must be same");
		// }

		return "SignUp";

	}

	@GetMapping("/sign")
	public String onSign(String userId, String password, Model model,HttpServletRequest request,
			HttpServletResponse response ) throws IOException {
		log.info("user" + userId);
		log.info("password" + password);
		log.info("running the onSign in controller");
		try {
			ModuleDTO mDto = this.moduleService.signIn(userId, password);
			log.info("DTO--" + mDto);
			if (mDto.getSignInCount() >= 3) {

				model.addAttribute("lock", "Account has been locked due wrong credentials");
				return "SignIn";
			}
			if (mDto != null) {
				if (mDto.getPasswordReset() == true) {
					if (!mDto.getPassTimeOut().isAfter(LocalTime.now())) {
						log.info("checking the password timeout");
						model.addAttribute("time", "timeout of reset password");
						return "SignIn";
					}

					model.addAttribute("user", mDto.getUserId());
					return "UpdatePassword";
				}
				log.info("password and userId matched");
				//model.addAttribute("user", mDto.getUserId());
				HttpSession session=request.getSession(true);
				session.setAttribute("user", mDto.getUserId());
				session.setAttribute("pic", mDto.getPicPath());
				session.setAttribute("mdto", mDto);
				return "SignInSuccess";
			}
		}

		catch (Exception e) {
			log.info("" + e.getMessage());
		}

		model.addAttribute("fail", "userId n password is not matched ");
		return "SignIn";
	}

	@PostMapping("/set")
	public String onReset(@RequestParam String email, Model model) {

		ModuleDTO reset = this.moduleService.resetPass(email);
		if (reset.getPasswordReset() == true) {
			model.addAttribute("reset", "password sent the given mail ,login again");
			return "PassReset";
		}
		return "PassReset";
	}

	@PostMapping("/passUpdate")
	public String onUpdate(String userId, String password, String confirmPassword, Model model) {
		this.moduleService.updatePass(userId, password, confirmPassword);
		// model.addAttribute("update", "Password updated successfully");
		return "PassUpdateSuccess";
	}

	@PostMapping("/profile")
	public String onProfile(@RequestParam("pic") MultipartFile file, String userId, String email, Long number, Model model)
			throws IOException {
		log.info("multipart is" + file);
		log.info("original name is" + file.getOriginalFilename());
		log.info("content type is" + file.getContentType());
		log.info("size is" + file.getSize());

		if (file.isEmpty()) {
			log.info("profile pic is not uploaded");
			model.addAttribute("addFile", "Please select a pic file");
			return "UpdateProfile";
		}
		model.addAttribute("added", "profile Updated successfully");
		byte[] bs = file.getBytes();
		Path path = Paths.get("J:\\images\\" +userId+System.currentTimeMillis()+".jpg");
		Files.write(path, bs);
		String picName = path.getFileName().toString();
		log.info("pic name is" + picName);
		ModuleDTO dto = this.moduleService.profileUpdate(userId, email, number, picName);
		log.info("infos are" + dto);
		return "UpdateProfile";
	}

	@GetMapping("/download") // to display the image
	public void onDownload(HttpServletResponse response, @RequestParam String fileName,ModuleDTO dto) throws IOException {
		Path path=Paths.get("J:\\images\\" +dto.getPicPath());
		path.toFile();
		response.setContentType("image/jpg");
		File file = new File("J:\\images\\" + fileName);
		InputStream input = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		IOUtils.copy(input, out);
		response.flushBuffer();
	}
	
	@PostMapping("/techno")
	public String onTechnologies(String userId,TechnologiesEntity tech,Model model) {
		ModuleDTO tDto=this.moduleService.techUpdate(userId, tech);
		log.info("techs dto"+tDto);
		model.addAttribute("techie", "User Technologies added Successfully");
		model.addAttribute("tech", tech);
		return "AddTechnology";
	}
	
	@GetMapping("/show")
	public String onTechView(@RequestParam String userId,Model model) {
		List<TechnologiesEntity> techList=this.moduleService.techList(userId);
		model.addAttribute("techList", techList);
		return "ShowTechnology";
	}
}
