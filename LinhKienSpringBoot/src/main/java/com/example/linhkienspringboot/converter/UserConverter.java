package com.example.linhkienspringboot.converter;

import org.springframework.stereotype.Component;

import com.example.linhkienspringboot.dto.UserDTO;
import com.example.linhkienspringboot.entity.UsersEntity;

@Component // nhúng
public class UserConverter {
	//automation Converter from....to....
	public UsersEntity toEntity(UserDTO userDTO) {

		UsersEntity entity = new UsersEntity();
		entity.setUserName(userDTO.getUserName());
		entity.setPassWord(userDTO.getPassWord());
		entity.setFullName(userDTO.getFullName());
		entity.setAddress(userDTO.getAddress());
		entity.setEmail(userDTO.getEmail());
		entity.setPhone(userDTO.getPhone());
		return entity;

	}

	public UserDTO toDTO(UsersEntity usersEntity ) {

		UserDTO userDTO = new UserDTO();
		userDTO.setId(usersEntity.getId());
		userDTO.setUserName(usersEntity.getUserName());
		userDTO.setPassWord(usersEntity.getPassWord());
		userDTO.setFullName(usersEntity.getFullName());
		userDTO.setAddress(usersEntity.getAddress());
		userDTO.setEmail(usersEntity.getEmail());
		userDTO.setPhone(usersEntity.getPhone());
		return userDTO;

	}
}
