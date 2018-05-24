package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;

@Controller
public class UserController {

	@Autowired
	private UserMapper mapper;
	
	@GetMapping("/user/{id}")
	@ResponseBody
	public User getUserById(@PathVariable String id){
		return mapper.getUserById(id);
	}
}
