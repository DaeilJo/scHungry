package com.sc.hungry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class mapController {
	
	@GetMapping(value="/map")
	public String map() throws Exception {
			
		System.out.println("signup controller:");
		return "map/map";
	}	
}
 