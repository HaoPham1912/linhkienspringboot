package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brands")
public class BrandEntity extends ParentEntity{
	
	@Column(name = "brandname")
	private String brandName;
	
	@Column(name = "brandcode")
	private String brandCode;

	@OneToMany(mappedBy = "brands")
	private List<ProductEntity> products = new ArrayList<>();
	
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}
	
	
}
