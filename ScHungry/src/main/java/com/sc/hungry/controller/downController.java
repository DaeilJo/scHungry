package com.sc.hungry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class downController {

	@GetMapping("down")	
	public String down() {
		return "down";
	}
}
