package com.example.shoplinhkien.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.dto.UsersDTO;
import com.example.shoplinhkien.entities.UsersEntity;
import com.example.shoplinhkien.repository.UserRepository;
import com.example.shoplinhkien.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UsersDTO save(UsersDTO dto) {
		UsersEntity usersEntity = new UsersEntity();
		usersEntity = modelMapper.map(dto, UsersEntity.class);	
		usersEntity = userRepository.save(usersEntity);
		return modelMapper.map(usersEntity, UsersDTO.class);
	}

}
