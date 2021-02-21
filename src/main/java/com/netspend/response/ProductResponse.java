package com.netspend.response;

public class ProductResponse {
	private String category;
	private String brand;
	private Double price;
	private String size;
	private String sku;
	private Integer seller_id;
	private Integer availableCount;

	public static class Builder {

		private String category;
		private String brand;
		private Double price;
		private Integer size;
		private String sku;
		private Integer seller_id;
		private Integer availableCount;

		public Builder(String category, String brand) {
			this.category = category;
			this.brand = brand;
		}

		public Builder price(Double price) {
			this.price = price;
			return this;
		}

		public Builder size(Integer size) {
			this.size = size;
			return this;
		}

		public ProductResponse build() {
			ProductResponse productResponse = new ProductResponse();
			productResponse.brand = this.brand;
			return productResponse;
		}

	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
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

	public Integer getSeller_id() {
		return seller_id;
	}

	public void setSeller_id(Integer seller_id) {
		this.seller_id = seller_id;
	}

	public Integer getAvailableCount() {
		return availableCount;
	}

	public void setAvailableCount(Integer availableCount) {
		this.availableCount = availableCount;
	}

}
