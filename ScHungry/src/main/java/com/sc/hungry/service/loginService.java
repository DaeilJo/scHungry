package com.sc.hungry.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.hungry.dto.loginDto;
import com.sc.hungry.mapper.loginMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class loginService {
	 @Autowired
	 private loginMapper loginMapper;
	 
	 public List<HashMap<String, Object>> login(String emailId) throws Exception{ //entity객체는 service에서만
		 	List<HashMap<String, Object>> list = loginMapper.findByMemberEmail(emailId);
	        
			return list;
	  }
}
