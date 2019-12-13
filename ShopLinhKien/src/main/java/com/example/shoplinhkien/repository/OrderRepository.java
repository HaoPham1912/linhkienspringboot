package com.example.shoplinhkien.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoplinhkien.entities.OrderEntity;
import com.example.shoplinhkien.entities.UsersEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
	List<OrderEntity> findByUsersEntity(UsersEntity usersEntity);
	
}
