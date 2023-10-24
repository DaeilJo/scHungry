package com.sc.hungry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class menuInfoController {
	@GetMapping(value="/menuInfo")
	public String menuInfo() throws Exception {
		System.out.println("menuInfo controller:");
		return "menuInfo/menuInfo";
	}	
}
