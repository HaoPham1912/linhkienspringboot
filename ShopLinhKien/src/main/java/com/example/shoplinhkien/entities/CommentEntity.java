package com.example.shoplinhkien.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity extends ParentEntity {
	
	@Column(name = "title",nullable = false)
	private String titleComment;
	
	@Column(nullable = false)
	private String content;
	
	@Column
	private Float rate;
	
	@ManyToOne
	@JoinColumn(name = "user_id",nullable = false)
	private UsersEntity userComment;
	
	@ManyToOne
	@JoinColumn(name = "product_id",nullable = false)
	private ProductEntity productComment;

	public String getTitleComment() {
		return titleComment;
	}

	public void setTitleComment(String titleComment) {
		this.titleComment = titleComment;
	}

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

	public UsersEntity getUserComment() {
		return userComment;
	}

	public void setUserComment(UsersEntity userComment) {
		this.userComment = userComment;
	}

	public ProductEntity getProductComment() {
		return productComment;
	}

	public void setProductent(ProductEntity productComment) {
		this.productComment = productComment;
	}
}
