package com.example.shoplinhkien.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.converter.CategoryConverter;
import com.example.shoplinhkien.dto.CategoryDTO;
import com.example.shoplinhkien.entities.CategoryEntity;
import com.example.shoplinhkien.repository.CategoryRepository;
import com.example.shoplinhkien.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Autowired
	private CategoryConverter converter;
	
	@Override
	public CategoryDTO save(CategoryDTO categoryDTO) {
		CategoryEntity categoryEntity = new  CategoryEntity();
		categoryEntity = converter.toEntity(categoryDTO);
		categoryEntity = repository.save(categoryEntity);
		return converter.toDto(categoryEntity);
	}

}
