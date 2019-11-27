package com.example.shoplinhkien.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class CategoryEntity extends ParentEntity{
	
	@Column(name = "categoryname",nullable = false,unique = true)
	private String categoryName;
	
	@Column(name = "categorycode",nullable = false, unique = true)
	private String categoryCode;

	@OneToMany(mappedBy = "categoryEntity")
	private List<ProductEntity> productList = new ArrayList<ProductEntity>();
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public List<ProductEntity> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductEntity> productList) {
		this.productList = productList;
	}
	
	
}
