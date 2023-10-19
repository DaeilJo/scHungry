package com.sc.hungry.controller;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sc.hungry.dto.loginDto;
import com.sc.hungry.dto.signUpDto;
import com.sc.hungry.service.loginService;
import com.sc.hungry.service.signUpService;

@Controller
public class loginController {
	@Autowired
	private loginService loginService;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/login")
	public String login() {
		System.out.println("login controller:");
        return "login/login";
    }
	
	@ResponseBody
	@RequestMapping(value="/emailLogin", method=RequestMethod.POST)
	public List<HashMap<String, Object>> emailLogin(@RequestBody String emailId) throws Exception {
		List<HashMap<String, Object>> list = loginService.login(emailId);	
		
		return list;
	}
	
	@GetMapping("/main")
	public String main() {
		System.out.println("main controller:");
        return "main/main";
    }
	
	@GetMapping(value="/getMac")
	public String getMac() {
		String result = "";
		InetAddress ip;
		logger.debug("juso getMac::");
		try {
			ip = InetAddress.getLocalHost();
		   
			NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			byte[] mac = network.getHardwareAddress();
		   
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < mac.length; i++) {
				sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
			}
				result = sb.toString();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e){
			e.printStackTrace();
		}
		    
		return result;
    }
}
