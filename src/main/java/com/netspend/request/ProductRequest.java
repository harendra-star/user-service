package com.netspend.request;

public class ProductRequest {

	private String brandName;
	private Double price;
	private String size;
	private String sku;
	private Integer sellerName;

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Integer getSellerName() {
		return sellerName;
	}

	public void setSellerName(Integer sellerName) {
		this.sellerName = sellerName;
	}

}
