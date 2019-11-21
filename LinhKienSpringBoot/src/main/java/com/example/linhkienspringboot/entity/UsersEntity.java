package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class UsersEntity extends ParentEntity {
	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String passWord;

	@Column(name = "status")
	private Integer status;

	@Column(name = "fullname")
	private String fullName;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;

	@OneToMany(mappedBy = "userOrder")
	private List<OrderEntity> orderList = new ArrayList<>();

	@OneToMany(mappedBy = "userComment")
	private List<CommentEntity> commentList = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "role_id")
	private RoleEntity roleEntity;
	
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


	public List<CommentEntity> getCommentList() {
		return commentList;
	}

	public void setCommentList(List<CommentEntity> commentList) {
		this.commentList = commentList;
	}

	public RoleEntity getRoleEntity() {
		return roleEntity;
	}

	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}
	
}
