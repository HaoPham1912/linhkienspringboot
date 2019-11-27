package com.example.shoplinhkien.service;

import java.util.List;

import com.example.shoplinhkien.dto.ProductDTO;

public interface IProductService {
	ProductDTO save(ProductDTO productDTO);
	List<ProductDTO> findAll();
}
