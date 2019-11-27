package com.example.shoplinhkien.converter;

import org.springframework.stereotype.Component;

import com.example.shoplinhkien.dto.ProductDTO;
import com.example.shoplinhkien.entities.ProductEntity;

@Component
public class ProductConverter {

	public ProductDTO toDto(ProductEntity entity) {
		ProductDTO dto = new ProductDTO();
		if(entity.getId()!=null) {
			dto.setId(entity.getId());
		}
		dto.setBrand(entity.getBrand());
		dto.setColor(entity.getColor());
		dto.setDescription(entity.getDecription());
		dto.setName(entity.getName());
		dto.setSeries(entity.getSeries());
		dto.setPrice(entity.getPrice());
		dto.setPromoPrice(entity.getPromoPrice());
		dto.setRating(entity.getRating());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		dto.setWarranty(entity.getWarranty());
//		dto.setCategory_id(entity.getCategoryEntity().getId());
		return dto;
	}
	
	public ProductEntity toEntity(ProductDTO dto) {
		ProductEntity entity = new ProductEntity();
		entity.setBrand(dto.getBrand());
		entity.setColor(dto.getColor());
		entity.setDecription(dto.getDescription());
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setPromoPrice(dto.getPromoPrice());
		entity.setRating(dto.getRating());
		entity.setSeries(dto.getSeries());
		entity.setWarranty(dto.getWarranty());
		return entity;
	}
	
	public ProductEntity toEntity(ProductDTO dto, ProductEntity entity) {
		entity.setBrand(dto.getBrand());
		entity.setColor(dto.getColor());
		entity.setDecription(dto.getDescription());
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());
		entity.setPromoPrice(dto.getPromoPrice());
		entity.setRating(dto.getRating());
		entity.setSeries(dto.getSeries());
		entity.setWarranty(dto.getWarranty());
		return entity;
	}
}
