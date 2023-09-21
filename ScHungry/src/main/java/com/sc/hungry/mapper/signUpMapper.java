package com.sc.hungry.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sc.hungry.dto.signUpDto;

@Mapper
public interface signUpMapper {

    int idCheckScUser(String id) throws Exception;
    public void createScUser(signUpDto signUpDto) throws Exception;
}

