package com.sc.hungry.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface loginMapper {
	public List<HashMap<String, Object>> findByMemberEmail(String emailId) throws Exception;
}
