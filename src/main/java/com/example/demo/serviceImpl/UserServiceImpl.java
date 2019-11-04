package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserMapper userMapper;
	@Override
	public int createUser(SysUser user) {
		// TODO Auto-generated method stub
		return userMapper.insertUser(user);
	}
	@Override
	public List<SysUser> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUsers();
	}

}
