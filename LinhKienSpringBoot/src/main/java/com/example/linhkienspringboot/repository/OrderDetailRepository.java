package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.OrderDetailEntity;


public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Long>{

}
