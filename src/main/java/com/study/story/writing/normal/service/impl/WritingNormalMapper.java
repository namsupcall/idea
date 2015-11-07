package com.study.story.writing.normal.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

/**
 * 블러그(일반)
 * @author nsdeveloper
 *
 */

@Repository(value="com.study.story.writing.normal.service.impl.WritingNormalMapper")
public interface WritingNormalMapper {
	/**
	 * 블러그(일반) 글 목록 가져오기
	 * @param param
	 * @return
	 * @throws Exception
	 */
	List<Map<String,Object>> getNormalList(Map<String, Object> param) throws Exception;
}
