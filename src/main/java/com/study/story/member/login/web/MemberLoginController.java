package com.study.story.member.login.web;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.story.member.login.service.MemberLoginService;

/**
 * 회원 로그인
 * @author nsdeveloper
 *
 */
@Controller
@RequestMapping(value = "/member/login/")
public class MemberLoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberLoginController.class);
	
	/** EgovSampleService */
	@Resource(name = "com.study.story.member.login.service.impl.MemberLoginService")
	private MemberLoginService memberLoginService;
	
	/**
	 * 로그인 페이지 호출
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "loginView", method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model model) {
		return "story/member/login/loginView";
	}
	
	/**
	 * 로그인
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		Map<String,Object> param 		= new HashMap<String,Object>();
		Map<String,Object> memberInfo 	= new HashMap<String,Object>();
		
		String memberId = (String)request.getParameter("memberId");
		String memberPw = (String)request.getParameter("memberPw");
		param.put("memberId", memberId);
		param.put("memberPw", memberPw);
		
		try {
			memberInfo = memberLoginService.getLoginCheck(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("memberInfo", memberInfo);
		return "story/member/login/loginSuccess";
	}

	/**
	 * 로그인
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "login2", method = RequestMethod.POST)
	public String login2(@RequestParam Map <String, Object> commandMap, Model model) {
		Map<String,Object> memberInfo 	= new HashMap<String,Object>();
		
		try {
			memberInfo = memberLoginService.getLoginCheck(commandMap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		model.addAttribute("memberInfo", memberInfo);
		return "story/member/login/loginSuccess";
	}
}
