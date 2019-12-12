package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.CategoryDTO;
import com.example.shoplinhkien.service.ICategoryService;
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
@RestController
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	@PostMapping(value = "/category")
	public CategoryDTO create(@RequestBody CategoryDTO dto) {
		return categoryService.save(dto);
	}
	@GetMapping(value = "/listAllCategory")
	public List<CategoryDTO> list(){
		return categoryService.findAll();
	}
}
