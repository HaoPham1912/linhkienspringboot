package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.UsersEntity;


public interface UserRepository extends JpaRepository<UsersEntity, Long> {
	
	
}
