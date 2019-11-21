package com.example.linhkienspringboot.dto;

public class CommentDTO {
	
	private String content;
	private Float rate;
	private String titleComment;
	private Long productId;
	private Long userId;
	
	
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getTitleComment() {
		return titleComment;
	}
	public void setTitleComment(String titleComment) {
		this.titleComment = titleComment;
	}
	
}
