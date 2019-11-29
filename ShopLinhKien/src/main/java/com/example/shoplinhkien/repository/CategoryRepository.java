package com.example.shoplinhkien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCategoryCode(String code);
}
