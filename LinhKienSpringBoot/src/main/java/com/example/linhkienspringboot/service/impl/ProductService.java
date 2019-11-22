package com.example.linhkienspringboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.linhkienspringboot.converter.ProductConverter;
import com.example.linhkienspringboot.dto.ProductDTO;
import com.example.linhkienspringboot.entity.ProductEntity;
import com.example.linhkienspringboot.repository.ProductRepository;
import com.example.linhkienspringboot.service.IProductService;

@Service
public class ProductService implements IProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ProductConverter productConverter;
	
	@Override
	public List<ProductDTO> findAll() {
		List<ProductDTO> productList = new ArrayList<ProductDTO>();
		List<ProductEntity> productEntity = productRepository.findAll();
		for(ProductEntity entitis :productEntity ) {
			ProductDTO productDTO =  productConverter.toDto(entitis);
			productList.add(productDTO);
		}
		return productList;
	}
}
