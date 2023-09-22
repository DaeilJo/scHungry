package com.sc.hungry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.hungry.dto.signUpDto;
import com.sc.hungry.service.signUpService;

@Controller

public class signUpController {
	@Autowired
	private signUpService signUpService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/signUp")
	public String signUp() throws Exception {
			
		System.out.println("signup controller:");
		return "signUp/signUp";
	}	
	
	@ResponseBody
	@RequestMapping(value="/idCheck" , method=RequestMethod.POST)
	public int idCheck(@RequestBody String id) throws Exception {
	
		int count = 0;
	    count = signUpService.idCheck(id);
	    System.out.println("signup controller:" +count);
	    return count;   
	}
	
	 @RequestMapping(value="/createScUser", method=RequestMethod.POST)
	 public String createScUser(signUpDto signUpDto) throws Exception {

		 	int count = 0;
		    count = signUpService.idCheck(signUpDto.getEmailId());
	        
	        try {
	            if(count == 0) signUpService.createScUser(signUpDto);                
	        } catch (Exception e) {
	        		e.printStackTrace();
	                logger.info("*****존재 하는 아이디");
	        }
	        return "login/login";
	  }
}

