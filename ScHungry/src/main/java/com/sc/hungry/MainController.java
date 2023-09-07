package com.sc.hungry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MainController {
	@GetMapping(value = {"/", "/index"})	
	public String index() {
		return "/index";
	}
	@GetMapping("/hello")
	public String hello() {
		return "/hello";
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
