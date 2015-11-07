package com.study.story.writing.normal.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.story.writing.normal.service.WritingNormalService;

/**
 * 블러그(일반)
 * @author nsdeveloper
 *
 */
@Controller
@RequestMapping(value = "/writing/normal/")
public class WritingNormalController {
	
	private static final Logger logger = LoggerFactory.getLogger(WritingNormalController.class);
	
	@Resource(name = "com.study.story.writing.normal.service.impl.WritingNormalService")
	private WritingNormalService writingNormalService;
	
	/**
	 * 로그인 페이지 호출
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "normalList", method = RequestMethod.GET)
	public String loginView(HttpServletRequest request, Model model) {
		Map<String,Object> param 			= new HashMap<String,Object>();
		List<Map<String,Object>> normalList = new ArrayList<Map<String,Object>>();
		
		try {
			normalList = writingNormalService.getNormalList(param);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("normalList", normalList);
		model.addAttribute("model", map);
		return "story/writing/normal/normalList";
	}
}
