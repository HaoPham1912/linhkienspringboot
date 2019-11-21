 package com.example.linhkienspringboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity extends ParentEntity{
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "rate")
	private Float rate;
	
	@Column
	private String titleComment;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productComment;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private CustomerEntity customerComment;
	
	@ManyToOne
	@JoinColumn(name = "admin_id")
	private AdminEntity adminComment;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public String getTitleComment() {
		return titleComment;
	}

	public void setTitleComment(String titleComment) {
		this.titleComment = titleComment;
	}

	public ProductEntity getProductComment() {
		return productComment;
	}

	public void setProductComment(ProductEntity productComment) {
		this.productComment = productComment;
	}

	public CustomerEntity getCustomerComment() {
		return customerComment;
	}

	public void setCustomerComment(CustomerEntity customerComment) {
		this.customerComment = customerComment;
	}

	public AdminEntity getAdminComment() {
		return adminComment;
	}

	public void setAdminComment(AdminEntity adminComment) {
		this.adminComment = adminComment;
	}

	
	
}
