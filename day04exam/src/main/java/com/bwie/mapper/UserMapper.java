package com.bwie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bwie.bean.User;

public interface UserMapper {
	@Select("select * from user")
	public List<User> selectAll();
}
