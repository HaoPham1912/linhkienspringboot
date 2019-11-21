package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "admin")
public class AdminEntity extends ParentEntity{
	
	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "phone")
	private String phone;

	@Column(name = "address")
	private String address;
	
	@OneToOne
	@JoinColumn(name = "account_id")
	private AccountEntity accountAdmin;

	@OneToMany(mappedBy = "adminComment")
	private List<CommentEntity> commentAdList = new ArrayList<CommentEntity>();
	
	//getter/ setter
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public AccountEntity getAccountAdmin() {
		return accountAdmin;
	}

	public void setAccountAdmin(AccountEntity accountAdmin) {
		this.accountAdmin = accountAdmin;
	}

	public List<CommentEntity> getCommentAdList() {
		return commentAdList;
	}

	public void setCommentAdList(List<CommentEntity> commentAdList) {
		this.commentAdList = commentAdList;
	}
	
	
}
