package com.bod.tis.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {

	@GetMapping("/")
	public String home() {
		return "board";
	}


}
