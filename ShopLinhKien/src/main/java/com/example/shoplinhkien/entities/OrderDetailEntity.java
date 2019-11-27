package com.example.shoplinhkien.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderdetails")
public class OrderDetailEntity extends ParentEntity{
	
	@Column(nullable = false)
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private OrderEntity orderEntity;
	
	@ManyToOne
	@JoinColumn(name = "product_id", nullable = false)
	private ProductEntity productOrDetail;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	public ProductEntity getProductOrDetail() {
		return productOrDetail;
	}

	public void setProductOrDetail(ProductEntity productOrDetail) {
		this.productOrDetail = productOrDetail;
	}
	
	
}
