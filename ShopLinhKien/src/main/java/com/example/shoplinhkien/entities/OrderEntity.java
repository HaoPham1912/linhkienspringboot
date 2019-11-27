package com.example.shoplinhkien.entities;

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
	
	@Column(nullable = false)
	private String nameCustomer;
	
	@Column(nullable = false)
	private String shipAddress;
	
	@Column(nullable = false)
	private Date shipDate;
	
	@Column(nullable = false)
	private Integer status;
	
	@Column(nullable = false)
	private Double totalPrice;
	
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false)
	private UsersEntity usersEntity;
	
	@OneToMany(mappedBy = "orderEntity")
	private List<OrderDetailEntity> orderDetailList = new ArrayList<OrderDetailEntity>();

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public UsersEntity getUsersEntity() {
		return usersEntity;
	}

	public void setUsersEntity(UsersEntity usersEntity) {
		this.usersEntity = usersEntity;
	}

	public List<OrderDetailEntity> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetailEntity> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
}
