package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.BrandEntity;


//khong can implement vi trong JPARepository da co cac ham dc build san

public interface BrandRepository extends JpaRepository<BrandEntity, Long> {

}
