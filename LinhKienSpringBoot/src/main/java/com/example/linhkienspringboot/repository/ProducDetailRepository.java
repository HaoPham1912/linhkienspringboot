package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.ProductDetailsEntity;


public interface ProducDetailRepository extends JpaRepository<ProductDetailsEntity, Long> {

}
