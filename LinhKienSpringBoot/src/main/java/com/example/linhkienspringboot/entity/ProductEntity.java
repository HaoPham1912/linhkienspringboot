package com.example.linhkienspringboot.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductEntity extends ParentEntity {

	@Column(name = "title")
	private String title;

	@Column(name = "rating")
	private Float rating;

	@Column(name = "price")
	private Double price;

	@Column(name = "promoprice")
	private Double promoPrice;

	@Column(name = "shortdecription")
	private String shortDecription;

	@Lob
	@Column(name = "image", length = Integer.MAX_VALUE, nullable = true)
	private byte[] image;

	@Column(name = "thumnail")
	private String thumbnail;

	@ManyToOne
	@JoinColumn(name = "brand_id")
	private BrandEntity brands;

	@OneToMany(mappedBy = "product")
	private List<ImgaeEntity> imageList = new ArrayList<>();
	
	@OneToMany(mappedBy = "productComment")
	private List<CommentEntity> comment  = new ArrayList<>();

	@OneToOne(mappedBy = "productEntity", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
	private ProductDetailsEntity productDetails;
	
	@ManyToOne
	@JoinColumn(name = "orderdetail_id")
	private OrderDetailEntity orDetailEntity;
	

	// getter/setter
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

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public BrandEntity getBrands() {
		return brands;
	}

	public void setBrands(BrandEntity brands) {
		this.brands = brands;
	}

	public List<ImgaeEntity> getImageList() {
		return imageList;
	}

	public void setImageList(List<ImgaeEntity> imageList) {
		this.imageList = imageList;
	}

	public ProductDetailsEntity getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(ProductDetailsEntity productDetails) {
		this.productDetails = productDetails;
	}

	public List<CommentEntity> getComment() {
		return comment;
	}

	public void setComment(List<CommentEntity> comment) {
		this.comment = comment;
	}

	public OrderDetailEntity getOrDetailEntity() {
		return orDetailEntity;
	}

	public void setOrDetailEntity(OrderDetailEntity orDetailEntity) {
		this.orDetailEntity = orDetailEntity;
	}
	

}
