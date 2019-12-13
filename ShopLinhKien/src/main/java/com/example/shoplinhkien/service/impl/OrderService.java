package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.dto.OrderDTO;
import com.example.shoplinhkien.entities.OrderEntity;
import com.example.shoplinhkien.repository.OrderRepository;
import com.example.shoplinhkien.repository.UserRepository;
import com.example.shoplinhkien.service.IOrderService;

@Service
public class OrderService implements IOrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<OrderDTO> findOrderByCustomer(Long idcustomer) {
		List<OrderDTO> result = new ArrayList<OrderDTO>();
		List<OrderEntity>  entities = orderRepository.findByUsersEntity(userRepository.getOne(idcustomer));
		for(OrderEntity entity : entities) {
			OrderDTO dto = modelMapper.map(entity, OrderDTO.class);
			dto.setUser_id(entity.getId());
			result.add(dto);
		}
		return result;
	}
}
