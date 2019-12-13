package com.example.shoplinhkien.service;

import java.util.List;

import com.example.shoplinhkien.dto.UsersDTO;

public interface IUserService {
	UsersDTO save(UsersDTO dto);
	List<UsersDTO> allListUSer();
	UsersDTO loadUserByUsername(String username);
}
