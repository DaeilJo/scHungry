package com.sc.hungry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class myPageController {
	@GetMapping(value="/myPage")
	public String myPage() throws Exception {
			
		System.out.println("myPage controller:");
		return "myPage/myPage";
	}	
}
