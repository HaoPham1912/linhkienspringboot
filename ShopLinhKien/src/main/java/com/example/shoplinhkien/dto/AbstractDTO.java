package com.example.shoplinhkien.dto;

import java.util.Date;

public class AbstractDTO<T> {

	private Long id;
	private String createdBy;
	private Date createdDate;
	private String modifiedBy;
	private Date modifiedDate;

//	private List<T> list = new ArrayList<>();

	public String getCreatedBy() {
		return createdBy;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

//	public List<T> getList() {
//		return list;
//	}
//
//	public void setList(List<T> list) {
//		this.list = list;
//	}
	
}
