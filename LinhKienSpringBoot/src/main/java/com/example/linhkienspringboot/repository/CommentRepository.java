package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.CommentEntity;


public interface CommentRepository extends JpaRepository<CommentEntity, Long>{

}
