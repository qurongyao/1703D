package com.bwie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwie.bean.User;
import com.bwie.mapper.UserMapper;
@Service
@Transactional
public class ServiceImpl implements IService{
	@Autowired
	private UserMapper um;

	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return um.selectAll();
	}
	
}
