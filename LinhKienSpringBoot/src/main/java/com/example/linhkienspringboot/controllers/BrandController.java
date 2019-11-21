package com.example.linhkienspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {
	
	@GetMapping(value = "/brand")
	public String getBrandDTO() {
		return "da vo day";
	}
	
}
