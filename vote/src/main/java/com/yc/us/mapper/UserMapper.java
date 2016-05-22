package com.yc.us.mapper;

import com.yc.us.entity.User;

public interface UserMapper {

	User getUser(User user);

	int insertUser(User user);

	int updateStuts(String  vU_EAMIL);
	
	
}
