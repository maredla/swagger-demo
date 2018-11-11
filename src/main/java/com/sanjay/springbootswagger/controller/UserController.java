package com.sanjay.springbootswagger.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjay.springbootswagger.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping
	public List<User> getUsers() {
		return Arrays.asList(
				new User("sanjay",12),
				new User("maredla",24)
				);
	}
	
	@GetMapping("/{userName}")
	public User getUserDeatils(@PathVariable("userName") final String userName) {
		return new User(userName,24);
	}
	
}
