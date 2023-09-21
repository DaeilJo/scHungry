package com.sc.hungry.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class mainController {
	@GetMapping("main")	
	public String home() {
		return "main";
	}
}
