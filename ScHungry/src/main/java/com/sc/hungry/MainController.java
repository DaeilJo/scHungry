package com.sc.hungry;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
public class MainController {
	@GetMapping(value = {"/", "index"})	
	public String index() {
		return "/index";
	}
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	@GetMapping("/signUp")
	public String signUp() {
		return "/signUp";
	}
	
	@GetMapping("/ScHungryLgn01V")
	public String ScHungryLgn01V() {
		return "biz/login/ScHungryLgn01V";
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
