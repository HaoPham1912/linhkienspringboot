package com.example.shoplinhkien.dto;

public class ImageDTO extends AbstractDTO<ImageDTO>{

	private String name;
	private Long product_id;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	
}
