package com.example.shoplinhkien.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoplinhkien.dto.CommentDTO;
import com.example.shoplinhkien.entities.CommentEntity;
import com.example.shoplinhkien.repository.CommentRepository;
import com.example.shoplinhkien.service.ICommentService;


@Service
public class CommentService implements ICommentService{

	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<CommentDTO> getAllComment() {
		List<CommentEntity> commentEntity = new ArrayList<CommentEntity>();
		List<CommentDTO> commentDTO = new ArrayList<CommentDTO>();
		commentEntity = commentRepository.findAll();
		for(CommentEntity entity :commentEntity) {
			CommentDTO dto = mapper.map(entity, CommentDTO.class);
			dto.setUser_id(entity.getUserComment().getId());
			dto.setProduct_id(entity.getProductComment().getId());
			commentDTO.add(dto);
		}
		return commentDTO;
	}
}
