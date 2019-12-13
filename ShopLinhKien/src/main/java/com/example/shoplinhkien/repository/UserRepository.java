package com.example.shoplinhkien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.UsersEntity;

public interface UserRepository extends JpaRepository<UsersEntity, Long>{
	UsersEntity findByUserName(String userName);
}
