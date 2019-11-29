package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.dto.RoleDTO;
import com.example.shoplinhkien.entities.RoleEntity;
import com.example.shoplinhkien.repository.RoleRepository;
import com.example.shoplinhkien.service.IRoleService;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public List<RoleDTO> getAllRole() {
		List<RoleEntity> roleEntities = new ArrayList<RoleEntity>();
		List<RoleDTO> roleDTOs = new ArrayList<RoleDTO>();
		roleEntities = roleRepository.findAll();
		for(RoleEntity entity :roleEntities) {
			RoleDTO dto = modelMapper.map(entity, RoleDTO.class);
			roleDTOs.add(dto);
		}
		return roleDTOs;
	}

}
