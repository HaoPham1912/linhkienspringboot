package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="roles")
public class RoleEntity extends ParentEntity{
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "role")
	private List<AccountEntity> account = new ArrayList<>();
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AccountEntity> getAccount() {
		return account;
	}

	public void setAccount(List<AccountEntity> account) {
		this.account = account;
	}

	
	
}
