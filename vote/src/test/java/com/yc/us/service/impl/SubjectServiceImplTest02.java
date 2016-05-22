package com.yc.us.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.us.entity.Option;
import com.yc.us.entity.OptionBean;
import com.yc.us.entity.VoteBean;
import com.yc.us.service.SubjectService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SubjectServiceImplTest02  {
	@Autowired
	private SubjectService subjectService;
	
	@Test
	public void testFindByOptionsById() {
		OptionBean list=subjectService.findByOptionsById(101);
		System.out.println(list);
		
	}
	
	@Test
	public void testFindByOptionsById02() {
		VoteBean list=subjectService.findVoteBeanByIds(101);
		System.out.println(list);
		
	}
	@Test
	public void test03() {
		
		
	}

}
