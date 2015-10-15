package com.study.story.member.join.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.story.member.join.service.MemberJoinService;

/**
 * 회원가입
 * @author nsdeveloper
 *
 */
@Service("com.study.story.member.join.service.impl.MemberJoinService")
public class MemberJoinServiceImpl implements MemberJoinService {
	
	@Resource(name="com.study.story.member.join.service.impl.MemberJoinMapper")
	private MemberJoinMapper memberJoinMapper;

	@Override
	public void setMemberInsert(Map<String, Object> param) throws Exception {
		memberJoinMapper.setMemberInsert(param);

		return;
	}

}
