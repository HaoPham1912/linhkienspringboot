package com.example.linhkienspringboot.dto;

public class ProductDTO extends ParentDTO{
	private String title;
	private Float rating;
	private Double price;
	private Double promoPrice;
	private String shortDecription;
	private byte[] image;
	private Long brand_id;
	private Long orderDetailId;
	private String thumbnail;
	
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getPromoPrice() {
		return promoPrice;
	}
	public void setPromoPrice(Double promoPrice) {
		this.promoPrice = promoPrice;
	}
	public String getShortDecription() {
		return shortDecription;
	}
	public void setShortDecription(String shortDecription) {
		this.shortDecription = shortDecription;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Long getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Long brand_id) {
		this.brand_id = brand_id;
	}
	public Long getOrderDetailId() {
		return orderDetailId;
	}
	public void setOrderDetailId(Long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}
}
