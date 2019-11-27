package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.CategoryDTO;
import com.example.shoplinhkien.service.ICategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping(value = "/category")
	public CategoryDTO create(@RequestBody CategoryDTO dto) {
		return categoryService.save(dto);
	}
	@GetMapping(value = "list")
	public List<CategoryDTO> list(){
		return categoryService.findAll();
	}
}
