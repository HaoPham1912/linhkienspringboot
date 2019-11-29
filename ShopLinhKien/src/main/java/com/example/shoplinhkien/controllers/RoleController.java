package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.RoleDTO;
import com.example.shoplinhkien.repository.RoleRepository;
import com.example.shoplinhkien.service.IRoleService;

@RestController
public class RoleController{

	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private IRoleService roleService;
	
	@GetMapping(value = "/getAllRole")
	public List<RoleDTO> findAll(){
		return roleService.getAllRole();
	}
}
