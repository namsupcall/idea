package com.study.story.writing.normal.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.study.story.writing.normal.service.WritingNormalService;

/**
 * v
 * @author nsdeveloper
 *
 */
@Service("com.study.story.writing.normal.service.impl.WritingNormalService")
public class WritingNormalServiceImpl implements WritingNormalService {
	
	@Resource(name="com.study.story.writing.normal.service.impl.WritingNormalMapper")
	private WritingNormalMapper writingNormalMapper;

	/**
	 * 블러그(일반) 글 목록 가져오기
	 */
	@Override
	public List<Map<String,Object>> getNormalList(Map<String, Object> param) throws Exception {
		return writingNormalMapper.getNormalList(param); 
	}

}
