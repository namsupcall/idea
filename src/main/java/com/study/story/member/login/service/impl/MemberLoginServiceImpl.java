package com.study.story.member.login.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.story.member.login.service.MemberLoginService;

/**
 * 회원로그인
 * @author nsdeveloper
 *
 */
@Service("com.study.story.member.login.service.impl.MemberLoginService")
public class MemberLoginServiceImpl implements MemberLoginService {
	
	@Resource(name="com.study.story.member.login.service.impl.MemberLoginMapper")
	private MemberLoginMapper memberLoginMapper;

	/**
	 * 회원정보 가져오기
	 */
	@Override
	public Map<String,Object> getLoginCheck(Map<String, Object> param) throws Exception {
		String memberPw = (String)param.get("memberPw");
		
		// 회원정보 가져오기
		Map<String,Object>memberInfo = memberLoginMapper.getMemberInfo(param);
		
		// 회원비밀번호 확인
		if (!memberPw.equals(memberInfo.get("memberPw"))) {
			memberInfo = null;
		}
		
		return memberInfo; 
	}

}
