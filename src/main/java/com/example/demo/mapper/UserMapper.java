package com.example.demo.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public int insertUser(SysUser user);
	public List<SysUser> selectAllUsers();
}
