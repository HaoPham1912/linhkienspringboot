package com.example.linhkienspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class AccountEntity extends ParentEntity {

	@Column(name = "username")
	private String userName;

	@Column(name = "password")
	private String passWord;

	@Column(name = "status")
	private Integer status;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private RoleEntity role;

	@OneToOne(mappedBy = "accountCustomer")
	private CustomerEntity customerEntity;
	
	@OneToOne(mappedBy = "accountAdmin")
	private AdminEntity adminEntity;

	// getter/setter
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

	public RoleEntity getRole() {
		return role;
	}

	public void setRole(RoleEntity role) {
		this.role = role;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public AdminEntity getAdminEntity() {
		return adminEntity;
	}

	public void setAdminEntity(AdminEntity adminEntity) {
		this.adminEntity = adminEntity;
	}
	

}