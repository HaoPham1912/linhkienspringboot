package com.example.shoplinhkien.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.CommentEntity;

public interface CommentRepository extends JpaRepository<CommentEntity, Long>{
	
}
