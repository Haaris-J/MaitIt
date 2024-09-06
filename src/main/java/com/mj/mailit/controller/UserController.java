package com.mj.mailit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mj.mailit.model.User;
import com.mj.mailit.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo repoObj;

	@GetMapping("/users")
	List<User> all() {
		System.out.println("api hit");
		return repoObj.findAll();
	}

	@PostMapping("/users")
	User newUser(@RequestBody User user) {
		return repoObj.save(user);
	}

}
