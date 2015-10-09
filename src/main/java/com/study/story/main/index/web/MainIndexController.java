package com.study.story.main.index.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author nsdeveloper
 *
 */
@Controller
public class MainIndexController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainIndexController.class);
	
	/**
	 * 메핀 페이지 호출
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(HttpServletRequest request, Model model) {
		return "story/main/index/index";
	}
	
}
