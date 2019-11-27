package com.example.shoplinhkien.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="roles")
public class RoleEntity extends ParentEntity{
	
	@Column(name = "code",nullable = false, unique = true)
	private String code;
	
	@Column(name = "name",nullable = false, unique = true)
	private String name;

	@OneToMany(mappedBy = "roleEntity")
	private List<UsersEntity> usersList = new ArrayList<UsersEntity>();
	
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

	public List<UsersEntity> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<UsersEntity> usersList) {
		this.usersList = usersList;
	}
	
}
