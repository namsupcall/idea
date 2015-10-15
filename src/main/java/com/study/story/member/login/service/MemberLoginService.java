package com.study.story.member.login.service;

import java.util.Map;

public interface MemberLoginService {
	/**
	 * 회원정보 가져오기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> getLoginCheck(Map<String,Object> param) throws Exception;
	
}
