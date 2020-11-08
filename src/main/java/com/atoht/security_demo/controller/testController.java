package com.atoht.security_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
	
	@Autowired
	private UserDetailsService userDetailsService;

	@GetMapping("login_test")
	public String login(String username) {
		username = "aaa";
		userDetailsService.loadUserByUsername(username);
		return "lo!!";
	}

	@GetMapping("hello")
	public String add() {
		return "hello!!";
	}
}
