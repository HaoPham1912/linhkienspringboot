package com.example.shoplinhkien.dto;

public class OrderDetailDTO extends AbstractDTO<OrderDetailDTO>{
	
	private Integer quantity;
	private Long order_id;
	private Long product_id;
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	
}
