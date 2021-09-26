package com.weng.mmall.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weng.mmall.dao.UserMapper;
import com.weng.mmall.pojo.User;
import com.weng.mmall.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
    private UserMapper userMapper;

	@Override
	public String login(String username, String password) {
		User user = userMapper.selectLogin(username, password);
		
		System.out.println("--------------------------" + user.getEmail());
		
		return "success";
	}

}
