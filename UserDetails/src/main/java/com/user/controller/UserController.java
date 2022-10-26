package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.domian.User;
import com.user.service.UserService;

@RestController
@Scope("request")
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
    
	@PostMapping("/register")
	public User Register(@RequestBody User user) {
		return userService.register(user);

	}
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return userService.login(user);

	}
}
