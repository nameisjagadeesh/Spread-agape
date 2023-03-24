package com.xworkz.missiles.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
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

import com.xworkz.missiles.dto.MissileDto;
import com.xworkz.missiles.service.MissileService;

@Controller
@RequestMapping("/")
public class MissileController {

	@Autowired
	private MissileService missileService;

	List<String> type = Arrays.asList("Military", "Survilence", "communication", "remoteSensing", "covertMissiles",
			"antiTerrorist");

	public MissileController() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@GetMapping("/missiles")
	public String onList(Model model) {
		System.out.println("running onList in controller");
		model.addAttribute("type", type);
		return "MissileDetails";
	}

	@PostMapping("/missiles")
	public String onResult(Model model, MissileDto dto) {
		System.out.println("running onResult in controller");
		Set<ConstraintViolation<MissileDto>> violation = this.missileService.validateAndSave(dto);
		if (violation.isEmpty()) {
			System.out.println("no violations are in dto");
			model.addAttribute("message", "Data Saved SuccessFully");
			model.addAttribute("type", type);
			return "MissileDetails";
		}
		model.addAttribute("errors", violation);
		model.addAttribute("type", type);
		model.addAttribute("messages", "errors are there data not saved");
		return "MissileDetails";
	}

	@GetMapping("/find")
	public String onFind(Model model, @RequestParam int id) {
		System.out.println("running onFind in controller");
		MissileDto dto = this.missileService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("mesage", "data did not find in dto");

		}
		return "MissileSearch";
	}

	@GetMapping("/delete")
	public String onDelete(Model model, @RequestParam int id) {
		System.out.println("running onDelete in controller");
		this.missileService.deleteById(id);
		if (id > 0) {
			System.out.println("id in controlled" + id);
			model.addAttribute("deleted", "model deleted Successfull...!");
		} else {
			model.addAttribute("delete", "Deleting the model Failed");
		}
		return "SearchByName";
	}

	@GetMapping("/searchByName")
	public String findByNameOfMissile(Model model, @RequestParam String name) {
		List<MissileDto> dto = this.missileService.findByName(name);
		model.addAttribute("lists", dto);
		return "SearchByName";
	}

	@GetMapping("/update")
	public String onUpdate(Model model, @RequestParam int id) {
		MissileDto dto = this.missileService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("type", type);
		return "MissileUpdate";
	}

	@PostMapping("/update")
	public String onUpdating(Model model, MissileDto dto) {
		Set<ConstraintViolation<MissileDto>> violations = this.missileService.updateAndSave(dto);
		if (violations.size() > 0) {
			model.addAttribute("errors", violations);
		} else {
			model.addAttribute("message", "Missiles Updated SuccessFully");
		}
		return "MissileUpdate";
	}

	@GetMapping("/list")
	public String onMissileList(Model model) {
		List<MissileDto> list = this.missileService.list();
		if (list != null && !list.isEmpty()) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("failed", "no data exist ,database is empty");
		}
		return "MissileList";
	}

	@GetMapping("/findByTwo")
	public String onFindByTwo(Model model) {
		List<MissileDto> lists = this.missileService.findByTwo(null, null);
		if (lists != null && !lists.isEmpty()) {
			model.addAttribute("lists", lists);
		} else {
			model.addAttribute("fail", "no datas exists");
		}
		return "FindByTwo";

	}

	@PostMapping("/upload")
	public String onUpload(@RequestParam("image") MultipartFile multipartFile) throws IOException {
		System.out.println("multipartFile---" + multipartFile);
		System.out.println(multipartFile.getContentType());
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getSize());

		byte[] bytes = multipartFile.getBytes();
		Path path = Paths.get("J:\\images\\" + multipartFile.getOriginalFilename());
		Files.write(path, bytes);
		return "FileUpload";
	}
	@GetMapping("/download") //to display the image
	public void onDownload(HttpServletResponse response,@RequestParam String fileName) throws IOException {
		
		response.setContentType("image/jpg");
		File file=new File("J:\\images\\"+fileName);
		InputStream input=new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out=response.getOutputStream();
		IOUtils.copy(input, out);
		response.flushBuffer();
	}
}
