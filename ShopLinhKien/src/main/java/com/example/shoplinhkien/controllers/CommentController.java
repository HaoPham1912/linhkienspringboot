package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.CommentDTO;
import com.example.shoplinhkien.service.ICommentService;

@RestController
public class CommentController {
	
	@Autowired
	private ICommentService commentService;

	
	@GetMapping(value = "/getAllComment")
	public List<CommentDTO> listComment(){
		return commentService.getAllComment();
	}
}
