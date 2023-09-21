package com.sc.hungry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sc.hungry.dto.signUpDto;
import com.sc.hungry.mapper.signUpMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class signUpService {
    @Autowired
    private signUpMapper signUpMapper;
	
	public int idCheck(String scUserId) throws Exception {

		System.out.println("signUpMapper service:" + scUserId);
        return signUpMapper.idCheckScUser(scUserId);
    } 
	
	public void createScUser(signUpDto signUpDto) throws Exception {

		System.out.println("signUpMapper signUpDto:" + signUpDto);
		signUpMapper.createScUser(signUpDto);
    } 
}
