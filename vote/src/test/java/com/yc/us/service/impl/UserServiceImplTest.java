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
public class UserServiceImplTest extends UserServiceImpl {
	
	@Autowired
	private UserService userService;
	
	User user=new User("ss","a","1021092219@qq.com");
	@Test
	public void testLogin() {
		user=userService.Login(user);
		
		assertEquals("测试成功", true,user);
		
	}

}
