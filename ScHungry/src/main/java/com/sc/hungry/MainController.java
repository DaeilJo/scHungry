package com.sc.hungry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	@GetMapping(value = {"/", "/index"})	
	public String index() {
		return "/index";
	}
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
}
