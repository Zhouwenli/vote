package com.yc.us.service;

import com.yc.us.entity.User;

public interface UserService {
	User Login(User user);
	int AddUser(User user);
	int updateStudius(String vU_EAMIL);
}
