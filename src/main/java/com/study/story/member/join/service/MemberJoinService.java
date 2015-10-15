package com.study.story.member.join.service;

import java.util.Map;

/**
 * 회원가입
 * @author nsdeveloper
 *
 */
public interface MemberJoinService {
	/**
	 * 회원정보 등록하기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	void setMemberInsert(Map<String,Object> param) throws Exception;
	
}
