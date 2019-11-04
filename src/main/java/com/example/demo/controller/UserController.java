package com.example.demo.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/register")
	public int register(SysUser user) {
		return userService.createUser(user);
	}
	
	@RequestMapping("/getAll")
	public List<SysUser> getAllUsers() {
		return userService.getAllUsers();
	}
}
