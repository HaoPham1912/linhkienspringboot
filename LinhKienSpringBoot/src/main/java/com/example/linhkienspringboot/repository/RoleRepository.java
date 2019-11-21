package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.RoleEntity;


public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
	RoleEntity findOneById(Long id);
}
