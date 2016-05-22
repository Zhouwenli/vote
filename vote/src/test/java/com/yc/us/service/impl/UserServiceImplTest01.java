package com.yc.us.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.us.entity.User;
import com.yc.us.service.UserService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class UserServiceImplTest01 extends UserServiceImpl {
	@Autowired
	private UserService userService;
	
	@Test
	public void testUpdateStudius() {
		
		int result=userService.updateStudius("1021092219@qq.com");
		assertNotNull(result);
	}

}
