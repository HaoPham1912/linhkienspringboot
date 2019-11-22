package com.example.linhkienspringboot.service;

import java.util.List;

import com.example.linhkienspringboot.dto.ProductDTO;

public interface IProductService {
	
	List<ProductDTO> findAll();

}
