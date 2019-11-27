package com.example.shoplinhkien.converter;

import org.springframework.stereotype.Component;

import com.example.shoplinhkien.dto.CategoryDTO;
import com.example.shoplinhkien.entities.CategoryEntity;


@Component
public class CategoryConverter {
	
	public CategoryEntity toEntity (CategoryDTO dto) {
		CategoryEntity entity = new CategoryEntity();
		entity.setCategoryCode(dto.getCategoryCode());
		entity.setCategoryName(dto.getCategoryName());
		/*
		 * entity.setCreatedBy(dto.getCreatedBy());
		 * entity.setCreatedDate(dto.getCreatedDate());
		 * entity.setModifiedBy(dto.getModifiedBy());
		 * entity.setModifiedDate(dto.getModifiedDate());
		 */
		return entity;
	}
	public CategoryDTO toDto (CategoryEntity entity) {
		CategoryDTO dto = new CategoryDTO();
		
		if(entity.getId()!= null) {
			dto.setId(entity.getId());
		}
		dto.setCategoryCode(entity.getCategoryCode());
		dto.setCategoryName(entity.getCategoryName());
		
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		return dto;
	}
	
	public CategoryEntity toEntity(CategoryDTO dto, CategoryEntity entity) {
		entity.setCategoryCode(dto.getCategoryCode());
		entity.setCategoryName(dto.getCategoryName());
		return entity;
	}
	
}
