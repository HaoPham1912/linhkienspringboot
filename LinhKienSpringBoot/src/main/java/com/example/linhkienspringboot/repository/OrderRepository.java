package com.example.linhkienspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.linhkienspringboot.entity.OrderEntity;

	
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
