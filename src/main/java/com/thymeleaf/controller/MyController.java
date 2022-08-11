package com.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String aboutHandler(Model m1) {
		m1.addAttribute("name", "Apoorv");
		m1.addAttribute("age", "25");
		return "about";
	}

	@GetMapping("/loop")
	public String loopHandler(Model m2) {
		List<String> city = List.of("Delhi", "Agra", "Jaipur", "Indore", "Patna");
		m2.addAttribute("city", city);
		return "loop";
	}
	
	@GetMapping("/condition")
	public String conditionalHandler(Model m3) {
		m3.addAttribute("user", "false");
		m3.addAttribute("gender", "M");
		m3.addAttribute("mylist",List.of(2,4));
		return "conditional";
	}
	
	@GetMapping("/fragment")
	public String fragmentHandler(Model m4 ) {
		m4.addAttribute("name","Iphone");
		m4.addAttribute("price", "47,000");
		return "host";
	}
	
	@GetMapping("/contact")
	public String getContact() {
		return "contact";
	}
}
