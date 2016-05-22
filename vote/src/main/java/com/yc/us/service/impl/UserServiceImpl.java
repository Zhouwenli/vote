package com.yc.us.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.us.entity.User;
import com.yc.us.mapper.UserMapper;
import com.yc.us.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public User Login(User user) {
		return userMapper.getUser(user) ;
	}

	@Override
	public int AddUser(User user) {
		
		return userMapper.insertUser(user);
	}

	@Override
	public int updateStudius(String vU_EAMIL) {
		
		return userMapper.updateStuts(vU_EAMIL);
	}

}
