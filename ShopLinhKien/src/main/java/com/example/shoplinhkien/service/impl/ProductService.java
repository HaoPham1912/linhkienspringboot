package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.converter.ProductConverter;
import com.example.shoplinhkien.dto.ProductDTO;
import com.example.shoplinhkien.entities.CategoryEntity;
import com.example.shoplinhkien.entities.ProductEntity;
import com.example.shoplinhkien.repository.CategoryRepository;
import com.example.shoplinhkien.repository.ProductRepository;
import com.example.shoplinhkien.service.IProductService;

@Service
public class ProductService implements IProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductConverter productConverter;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public ProductDTO save(ProductDTO productDTO) {
		ProductEntity productEntity = new ProductEntity();
		productEntity = productConverter.toEntity(productDTO);
		CategoryEntity categoryEntity = categoryRepository.findOneByCategoryCode(productDTO.getCategoryCode());
		productEntity.setCategoryEntity(categoryEntity);
		productEntity = productRepository.save(productEntity);
		return productConverter.toDto(productEntity);
	}

	@Override
	public List<ProductDTO> findAll() {
		List<ProductDTO> result = new ArrayList<ProductDTO>();
		List<ProductEntity> productEntities = productRepository.findAll();
		for(ProductEntity entity :productEntities) {
			ProductDTO productDTO = productConverter.toDto(entity);
			result.add(productDTO);
		}
		return result;
	}
}
