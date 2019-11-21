package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
