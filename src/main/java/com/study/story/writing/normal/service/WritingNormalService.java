package com.study.story.writing.normal.service;

import java.util.List;
import java.util.Map;

public interface WritingNormalService {
	/**
	 * 블러그(일반) 글 목록 가져오기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	List<Map<String,Object>> getNormalList(Map<String,Object> param) throws Exception;
	
}
