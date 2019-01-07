package com.wen.ftproject.controller.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wen.ftproject.entity.User;
import com.wen.ftproject.result.Result;
import com.wen.ftproject.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {
	@Resource(name="userService")
	public UserService userService;
	
	public Result<Object> add(User user){
		return userService.add(user);
	}
	
}
