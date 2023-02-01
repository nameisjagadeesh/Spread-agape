package com.xworkz.springBootstrap.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/food")
public class FoodItem {

	public FoodItem() {
		System.out.println("created" + this.getClass().getSimpleName());
	}

	@GetMapping
	public String serveFood(@RequestParam String foodName, @RequestParam String type, @RequestParam int quantity,
			@RequestParam Double price) {
		System.out.println("running serveFood");
		
		System.out.println("Foodname " + foodName);
		System.out.println("type " + type);
		System.out.println("quantity " + quantity);
		System.out.println("price " + price);
		return "FoodItem.jsp";
	}

}
