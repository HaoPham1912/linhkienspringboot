package com.example.shoplinhkien.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.shoplinhkien.dto.ProductDTO;
import com.example.shoplinhkien.service.IProductService;
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping(value = "/api/addProduct")
	public ProductDTO add(@RequestBody ProductDTO dto) {
		return productService.save(dto);
	}
	
	@GetMapping(value = "/api/getListProduct")
	public List<ProductDTO> findAdd(){
		return productService.findAll();
	}
	
	@DeleteMapping(value="/api/deleteProduct/{id}") 
	public void deleteProduct(@PathVariable("id") long id){
		productService.delete(id);
	}
}
