package com.example.shoplinhkien.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentEntity extends ParentEntity {
	
	@Column(name = "title")
	private String titleComment;
	
	@Column
	private String content;
	
	@Column
	private Float rate;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity userComment;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	private ProductEntity productCommnent;

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

	public ProductEntity getProductCommnent() {
		return productCommnent;
	}

	public void setProductCommnent(ProductEntity productCommnent) {
		this.productCommnent = productCommnent;
	}
	
}
