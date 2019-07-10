package com.bwie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bwie.bean.User;
import com.bwie.service.IService;

@Controller
public class UController {
	@Autowired
	private IService ss;
	
	@RequestMapping("list.do")
	public String list(Model m){
		List<User> list = ss.selectAll();
		m.addAttribute("list", list);
		System.out.println(list);
		return "list";
	}
}
