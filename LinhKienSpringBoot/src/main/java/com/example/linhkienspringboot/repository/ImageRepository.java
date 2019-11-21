package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.ImageEntity;

public interface ImageRepository extends JpaRepository<ImageEntity, Long>{

}
