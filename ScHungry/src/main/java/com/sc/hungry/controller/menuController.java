package com.sc.hungry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuController {
	@GetMapping(value="/menu")
	public String menu() throws Exception {
		System.out.println("menu controller:");
		return "menu/menu";
	}	
}
