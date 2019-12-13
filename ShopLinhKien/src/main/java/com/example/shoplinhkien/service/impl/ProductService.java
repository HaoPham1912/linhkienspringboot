package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
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
	
	@Autowired
	private ModelMapper modelMapper;
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
			ProductDTO productDTO = modelMapper.map(entity, ProductDTO.class);
			result.add(productDTO);
		}
		return result;
	}

	@Override
	public void delete(Long id) {
		productRepository.deleteById(id);
	}
}
