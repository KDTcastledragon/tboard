package com.bod.tis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Hello, Thymeleaf!");
		return "index";  // index.html 파일을 찾음
	}
}