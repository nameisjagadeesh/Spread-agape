package com.xworkz.springBootstrap.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springBootstrap.dto.TestDTO;

@Component
@RequestMapping("/test")
public class TestComponent {

	public TestComponent() {
		System.out.println("created " + this.getClass().getSimpleName());

	}

	@GetMapping
	public String writeTest(TestDTO dto) {

		System.out.println("running the writeTest");
		System.out.println("dto is" + dto);
		return "Testjsp.jsp";

	}

}
