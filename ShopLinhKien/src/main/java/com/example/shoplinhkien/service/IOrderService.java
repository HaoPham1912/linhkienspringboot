package com.example.shoplinhkien.service;

import java.util.List;

import com.example.shoplinhkien.dto.OrderDTO;

public interface IOrderService {
	List<OrderDTO> findOrderByCustomer(Long idcustomer);
}
