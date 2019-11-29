package com.example.shoplinhkien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>{
	RoleEntity findOneByCode(String code);
}
