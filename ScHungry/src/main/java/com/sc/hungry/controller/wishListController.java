package com.sc.hungry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class wishListController {
private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/wishList")
	public String wishList() throws Exception {
			
		System.out.println("wishList controller:");
		return "wishList/wishList";
	}	
}
