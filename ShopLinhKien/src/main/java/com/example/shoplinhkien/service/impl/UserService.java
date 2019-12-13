package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.converter.UserConverter;
import com.example.shoplinhkien.dto.UsersDTO;
import com.example.shoplinhkien.entities.UsersEntity;
import com.example.shoplinhkien.repository.UserRepository;
import com.example.shoplinhkien.service.IUserService;

@Service
public class UserService implements IUserService{
	

	@Autowired
	private UserRepository  userRepository;
	
	@Autowired
	private UserConverter userConverter;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UsersDTO save(UsersDTO dto) {
		UsersEntity usersEntity = new UsersEntity();
		
		if(dto.getId()!=null) {
			Optional<UsersEntity> oldUser = userRepository.findById(dto.getId());
			UsersEntity change = oldUser.get();
			usersEntity = userConverter.toEntity(dto, change);
		}
		else {
			usersEntity = modelMapper.map(dto, UsersEntity.class);
		}
		usersEntity = userRepository.save(usersEntity);
		UsersDTO results =modelMapper.map(usersEntity, UsersDTO.class);
		return results;
	}

	@Override
	public List<UsersDTO> allListUSer() {
		List<UsersEntity> entities = new ArrayList<UsersEntity>();
		List<UsersDTO> list = new ArrayList<UsersDTO>();
		entities = userRepository.findAll();
		for(UsersEntity entity:entities) {
			UsersDTO dto = modelMapper.map(entity, UsersDTO.class);
			list.add(dto);
		}
		return list;
	}

	@Override
	public UsersDTO loadUserByUsername(String username) {
		UsersEntity usersEntity = userRepository.findByUserName(username);

		UsersDTO dto = modelMapper.map(usersEntity, UsersDTO.class);
		return dto;
		
	}

}
