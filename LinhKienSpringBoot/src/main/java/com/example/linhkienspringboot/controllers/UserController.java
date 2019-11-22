package com.example.linhkienspringboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.linhkienspringboot.dto.UserDTO;
import com.example.linhkienspringboot.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@PostMapping(value = "/user")
	public UserDTO createUser(@RequestBody UserDTO userDTO) {
		return userService.save(userDTO);
	}
}
