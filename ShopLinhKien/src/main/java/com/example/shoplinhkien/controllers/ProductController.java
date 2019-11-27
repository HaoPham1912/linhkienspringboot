package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.ProductDTO;
import com.example.shoplinhkien.service.IProductService;

@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping(value = "/addproduct")
	public ProductDTO add(@RequestBody ProductDTO dto) {
		return productService.save(dto);
	}
	
	@GetMapping(value = "/getList")
	public List<ProductDTO> findAdd(){
		return productService.findAll();
	}
}
