package com.xworkz.missiles.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.missiles.bean.HelloWorldBean;

//rest api
@RestController
public class HelloWorldController {

	// to create the rest webservice
	@GetMapping(path = "/hello-world") // to map with get method
	public String hello() {
		return "hello world this is jagadeesh from bengaluru";
	}

	@GetMapping(path = "/hello-world-bean") // to return instance
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("hello world this is jagadeesh from bengaluru");
	}

	@GetMapping(path = "/hello-world/path-variable/{name}") // to return instance
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		//String.format is used instead of concatinating name variable
		return new HelloWorldBean(String.format("hello world this is jagadeesh from bengaluru %s", name));
	}
}
