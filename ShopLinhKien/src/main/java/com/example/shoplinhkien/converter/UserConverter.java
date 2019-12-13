package com.example.shoplinhkien.converter;

import org.springframework.stereotype.Component;

import com.example.shoplinhkien.dto.UsersDTO;
import com.example.shoplinhkien.entities.UsersEntity;

@Component
public class UserConverter {
	
	public UsersDTO toDto(UsersEntity entity) {
		UsersDTO dto = new UsersDTO();
		if(entity.getId()!= null) {
			dto.setId(entity.getId());
		}
		dto.setUserName(entity.getUserName());
		dto.setPassWord(entity.getPassWord());
		dto.setFullName(entity.getFullName());
		dto.setEmail(entity.getEmail());
		dto.setAddress(entity.getAddress());
		dto.setStatus(entity.getStatus());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		return dto;
	}
	
	public UsersEntity toEntity(UsersDTO dto) {
		UsersEntity entity = new UsersEntity();
		entity.setUserName(dto.getUserName());
		entity.setPassWord(dto.getPassWord());
		entity.setFullName(dto.getFullName());
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setStatus(dto.getStatus());
		return entity;
	}
	
	public UsersEntity toEntity(UsersDTO dto, UsersEntity entity) {
		entity.setUserName(dto.getUserName());
		entity.setPassWord(dto.getPassWord());
		entity.setFullName(dto.getFullName());
		entity.setAddress(dto.getAddress());
		entity.setEmail(dto.getEmail());
		entity.setStatus(dto.getStatus());
		return entity;
	}
}
