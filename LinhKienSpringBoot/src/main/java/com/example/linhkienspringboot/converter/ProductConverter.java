package com.example.linhkienspringboot.converter;

import org.springframework.stereotype.Component;

import com.example.linhkienspringboot.dto.ProductDTO;
import com.example.linhkienspringboot.entity.ProductEntity;

@Component
public class ProductConverter {
	public ProductDTO toDto(ProductEntity entity) {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setId(entity.getId());
		productDTO.setTitle(entity.getTitle());
		productDTO.setRating(entity.getRating());
		productDTO.setPrice(entity.getPrice());
		productDTO.setPromoPrice(entity.getPromoPrice());
		productDTO.setShortDecription(entity.getShortDecription());
		productDTO.setImage(entity.getImage());
		productDTO.setThumbnail(entity.getThumbnail());
		return productDTO;
	}
}
