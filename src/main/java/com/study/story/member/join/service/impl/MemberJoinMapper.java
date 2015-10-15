package com.study.story.member.join.service.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 회원가입
 * @author nsdeveloper
 *
 */
@Repository(value="com.study.story.member.join.service.impl.MemberJoinMapper")
public interface MemberJoinMapper {
	/**
	 * 회원정보 등록하기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	void setMemberInsert(Map<String, Object> param) throws Exception;
}
