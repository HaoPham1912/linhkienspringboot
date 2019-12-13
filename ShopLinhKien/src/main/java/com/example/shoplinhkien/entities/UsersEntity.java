package com.example.shoplinhkien.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class UsersEntity extends ParentEntity {
	@Column(name = "username", unique = true, nullable = false)
	@NotNull
	private String userName;

	@Column(name = "password", nullable = false)
	private String passWord;
	@Column(name = "role", nullable = false)
	private String role;

	@Column(name = "status", nullable = false)
	private Integer status;

	@Column(name = "fullname", nullable = false)
	private String fullName;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "address", nullable = false)
	private String address;

	@OneToMany(mappedBy = "usersEntity")
	private List<OrderEntity> orderList = new ArrayList<OrderEntity>();

	@OneToMany(mappedBy = "userComment")
	private List<CommentEntity> commList = new ArrayList<CommentEntity>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<OrderEntity> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderEntity> orderList) {
		this.orderList = orderList;
	}

	public List<CommentEntity> getCommList() {
		return commList;
	}

	public void setCommList(List<CommentEntity> commList) {
		this.commList = commList;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
