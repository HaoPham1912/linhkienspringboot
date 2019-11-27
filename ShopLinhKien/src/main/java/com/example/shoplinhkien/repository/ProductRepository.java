package com.example.shoplinhkien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long>{

}
