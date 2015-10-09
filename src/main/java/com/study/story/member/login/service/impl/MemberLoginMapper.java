package com.study.story.member.login.service.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 회원로그인
 * @author nsdeveloper
 *
 */
@Repository(value="com.study.story.member.login.service.impl.MemberLoginMapper")
public interface MemberLoginMapper {
	/**
	 * 회원정보 가져오기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> getMemberInfo(Map<String, Object> param) throws Exception;
}
