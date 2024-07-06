package com.bod.tis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Hello, Thymeleaf!");
		return "index";  // index.html 파일을 찾음
	}

	@GetMapping("/test2")
	public String test2() {
		return "test";  // index.html 파일을 찾음efwfew
	}

	@RequestMapping("/error")
	public String error(HttpServletRequest request) {
		return "에러 페이지입니다";
	}
}