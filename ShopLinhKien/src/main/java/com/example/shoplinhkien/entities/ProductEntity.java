package com.example.shoplinhkien.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity extends ParentEntity{
	
	@Column
	private String name;
	
	@Column
	private String brand;
	
	@Column
	private Double price;
	
	@Column
	private Double promoPrice;
	
	@Column
	private String series;
	
	@Column
	private String warranty;
	
	@Column
	private String color;
	
	@Column 
	private String decription;
	
	@Column
	private Float rating;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity categoryEntity;

	@OneToMany(mappedBy = "productEntity")
	private List<ImageEntity> imageList = new ArrayList<ImageEntity>();
	
	@OneToMany(mappedBy = "productOrDetail")
	private List<OrderDetailEntity> orderDetailList = new ArrayList<OrderDetailEntity>();
	
	@OneToMany(mappedBy = "productCommnent")
	private List<CommentEntity> commentList = new ArrayList<CommentEntity>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getPromoPrice() {
		return promoPrice;
	}

	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public CategoryEntity getCategoryEntity() {
		return categoryEntity;
	}

	public void setCategoryEntity(CategoryEntity categoryEntity) {
		this.categoryEntity = categoryEntity;
	}

	public List<ImageEntity> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImageEntity> imageList) {
		this.imageList = imageList;
	}

	public List<OrderDetailEntity> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailEntity> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public List<CommentEntity> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentEntity> commentList) {
		this.commentList = commentList;
	}
	
}
