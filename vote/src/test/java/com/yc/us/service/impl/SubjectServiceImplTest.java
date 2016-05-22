package com.yc.us.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.us.entity.Option;
import com.yc.us.entity.Subject;
import com.yc.us.entity.SubjectBean;
import com.yc.us.service.SubjectService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SubjectServiceImplTest {
	@Autowired
	private SubjectService subjectService;
	private SubjectBean subject;
	@Test
	public void testGetSubjectBean() {
		List<SubjectBean> subject=subjectService.getSubjectBean();
		System.out.println(subject);
		
		
	}
	
	

}
