package com.example.demo.service;

import java.util.List;

import com.example.demo.model.SysUser;

public interface UserService {
	public int createUser(SysUser user);
	public List<SysUser> getAllUsers();
}
