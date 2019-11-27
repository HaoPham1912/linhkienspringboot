package com.example.shoplinhkien.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class ImageEntity extends ParentEntity{
	
	
	
	@Column(nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productEntity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	
}
