package com.example.linhkienspringboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.linhkienspringboot.converter.UserConverter;
import com.example.linhkienspringboot.dto.UserDTO;
import com.example.linhkienspringboot.entity.RoleEntity;
import com.example.linhkienspringboot.entity.UsersEntity;
import com.example.linhkienspringboot.repository.RoleRepository;
import com.example.linhkienspringboot.repository.UserRepository;
import com.example.linhkienspringboot.service.IUserService;

@Service
public class UserService implements IUserService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserConverter userConverter;

	@Override
	public UserDTO save(UserDTO userDTO) {
		
		RoleEntity roleEntity = roleRepository.findOneById(userDTO.getRoleId());
		
		UsersEntity usersEntity = userConverter.toEntity(userDTO);
		//many to one
		usersEntity.setRoleEntity(roleEntity);
		
		usersEntity = userRepository.save(usersEntity);
		
		return userConverter.toDTO(usersEntity);
	}
}
