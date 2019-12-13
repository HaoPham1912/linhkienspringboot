package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.OrderDTO;
import com.example.shoplinhkien.service.impl.OrderService;



@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@GetMapping(value = "/api/getOrder/{idcus}")
	public List<OrderDTO> getOrderCus(@PathVariable("idcus") Long idcus){
		return orderService.findOrderByCustomer(idcus);
	}
}
