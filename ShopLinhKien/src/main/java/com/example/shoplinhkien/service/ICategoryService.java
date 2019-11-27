package com.example.shoplinhkien.service;

import java.util.List;

import com.example.shoplinhkien.dto.CategoryDTO;

public interface ICategoryService {
	CategoryDTO save (CategoryDTO categoryDTO);
	List<CategoryDTO> findAll();
}
