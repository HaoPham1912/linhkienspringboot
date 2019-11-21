package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity extends ParentEntity{
	
	@Column
	private String shipAddress;
	
	@Column
	private Date shipDate;
	
	@Column
	private Integer orderStatus;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	private UsersEntity userOrder;
	
	@OneToMany(mappedBy = "orderEntity")
	private List<OrderDetailEntity> orderDetailEntity = new ArrayList<>();
	

	public String getShipAddress() {
		return shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public Date getShipDate() {
		return shipDate;
	}

	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}


	public List<OrderDetailEntity> getOrderDetailEntity() {
		return orderDetailEntity;
	}

	public void setOrderDetailEntity(List<OrderDetailEntity> orderDetailEntity) {
		this.orderDetailEntity = orderDetailEntity;
	}

	public UsersEntity getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UsersEntity userOrder) {
		this.userOrder = userOrder;
	}
}
