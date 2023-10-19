package com.sc.hungry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class jusoController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/juso")
	public String juso() {
		logger.debug("juso Controller::");
        return "juso/juso";
    }
	
	@GetMapping("/mapJuso")
	public String mapJuso() {
		logger.debug("mapJuso Controller::");
        return "juso/mapJuso";
    }
}
