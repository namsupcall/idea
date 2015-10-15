package com.study.story.member.join.web;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.story.member.join.service.MemberJoinService;

/**
 * 회원 로그인
 * @author nsdeveloper
 *
 */
@Controller
@RequestMapping(value = "/member/join/")
public class MemberJoinController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberJoinController.class);
	
	@Resource(name = "com.study.story.member.join.service.impl.MemberJoinService")
	private MemberJoinService memberJoinService;
	
	/**
	 * 회원가입 페이지 호출
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "joinView", method = RequestMethod.GET)
	public String joinView(HttpServletRequest request, Model model) {
		return "story/member/join/joinView";
	}
	
	/**
	 * 회원정보 등록하기
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "joinView", method = RequestMethod.POST)
	public String joinViewPost(@RequestParam Map <String, Object> commandMap, Errors errors, Model model) {
		new MemberJoinValidator().validate(commandMap, errors);
		if (errors.hasErrors()) {
			return "/member/join/joinView.do";
		}
		try {
			memberJoinService.setMemberInsert(commandMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "/member/join/joinView.do";
		}
		
		return "redirect:/index.do";
	}
}
