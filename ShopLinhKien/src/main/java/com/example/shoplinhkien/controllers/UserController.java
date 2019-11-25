package com.example.shoplinhkien.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.UsersDTO;
import com.example.shoplinhkien.service.IUserService;

@RestController
public class UserController {

	@Autowired 
	private IUserService userService;
	
	@PostMapping(value = "/addUser")
	public UsersDTO add(@RequestBody UsersDTO usersDTO) {
		return userService.save(usersDTO);
	}
}
