package com.study.story.member.join.web;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.RegisterRequest;

/**
 * 회원 로그인
 * @author nsdeveloper
 *
 */

public class MemberJoinValidator implements Validator {
	private static final String emailRegExp =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
			"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern;

	public MemberJoinValidator() {
		pattern = Pattern.compile(emailRegExp);
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Map.class.isAssignableFrom(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		Map<String,Object> map = (Map<String,Object>) target;
		
		String memberNm 	= (String)map.get("memberNm");
		String memberId 	= (String)map.get("memberId");
		String memberPw 	= (String)map.get("memberPw");
		String memberPw2 	= (String)map.get("memberPw2");
		String email 		= (String)map.get("email");
		
		if (email == null || email.trim().isEmpty()) {
			errors.rejectValue("email", "required");
		} else {
			Matcher matcher = pattern.matcher(email);
			if (!matcher.matches()) {
				errors.rejectValue("email", "bad");
			}
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "required");
		ValidationUtils.rejectIfEmpty(errors, "password", "required");
		ValidationUtils.rejectIfEmpty(errors, "confirmPassword", "required");
		if (!memberPw.isEmpty()) {
			if (!memberPw.equals(memberPw2)) {
				errors.rejectValue("confirmPassword", "nomatch");
			}
		}
	}
}
