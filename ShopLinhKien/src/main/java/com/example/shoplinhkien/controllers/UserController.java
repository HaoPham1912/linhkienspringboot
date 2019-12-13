package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.UsersDTO;
import com.example.shoplinhkien.service.IUserService;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;

	@PostMapping(value = "/addUser")
	public UsersDTO addUser(@RequestBody UsersDTO dto) {
		return userService.save(dto);
	}
	
	@GetMapping(value = "/getAllUser")
	public List<UsersDTO> getAllUser(){
		return userService.allListUSer();
	}
	
	@PutMapping(value = "/editUser/{id}")
	public UsersDTO updateUser(@RequestBody UsersDTO usersDTO, 
			@PathVariable("id") Long id) {
		usersDTO.setId(id);
		return userService.save(usersDTO);
	}
}
