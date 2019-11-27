package com.example.shoplinhkien.converter;

import org.springframework.stereotype.Component;

import com.example.shoplinhkien.dto.CommentDTO;
import com.example.shoplinhkien.entities.CommentEntity;

@Component
public class CommentConverter {
	
	public CommentDTO toDto(CommentEntity entity) {
		CommentDTO dto = new CommentDTO();
		dto.setTitle(entity.getTitleComment());
		dto.setContent(entity.getContent());
		if(entity.getId()!= null) {
			dto.setId(entity.getId());
		}
		dto.setRate(entity.getRate());
		dto.setCreatedBy(entity.getCreatedBy());
		dto.setCreatedDate(entity.getCreatedDate());
		dto.setModifiedBy(entity.getModifiedBy());
		dto.setModifiedDate(entity.getModifiedDate());
		
		 dto.setUser_id(entity.getUserComment().getId());
		 dto.setProduct_id(entity.getProductComment().getId());
		 
		return dto;
	}
	
	public CommentEntity toEntity(CommentDTO dto) {
		CommentEntity entity = new CommentEntity();
		entity.setTitleComment(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setRate(dto.getRate());
		return entity;
	}
	
	public CommentEntity toEntity(CommentDTO dto, CommentEntity entity) {
		entity.setTitleComment(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setRate(dto.getRate());
		return entity;
	}
}
