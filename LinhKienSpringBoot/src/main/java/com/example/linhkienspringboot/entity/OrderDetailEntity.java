package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class OrderDetailEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private Integer quantity;

	@OneToMany(mappedBy = "orderDetail")
	List<ProductEntity> productList  = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private OrderEntity orderFK;
	
	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public List<ProductEntity> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductEntity> productList) {
		this.productList = productList;
	}

	public OrderEntity getOrderFK() {
		return orderFK;
	}

	public void setOrderFK(OrderEntity orderFK) {
		this.orderFK = orderFK;
	}

	
}
