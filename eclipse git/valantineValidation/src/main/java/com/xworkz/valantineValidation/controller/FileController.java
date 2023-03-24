package com.xworkz.valantineValidation.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class FileController {

	public FileController() {
		System.out.println("created " + this.getClass().getSimpleName());
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
		
		response.setContentType("image/jpeg");
		File file=new File("J:\\images\\"+fileName);
		InputStream input=new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out=response.getOutputStream();
		IOUtils.copy(input, out);
		response.flushBuffer();
	}
}
