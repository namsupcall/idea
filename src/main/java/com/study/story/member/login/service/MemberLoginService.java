package com.study.story.member.login.service;

import java.util.Map;

public interface MemberLoginService {
	Map<String,Object> getLoginCheck(Map<String,Object> param) throws Exception;
	
}
