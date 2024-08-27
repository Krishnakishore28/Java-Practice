package com.wipro.Hibernate2;

public class Product {
	private int productId;
	private String productName;
	private int productNumber;
	public Product(int productId, String productName, int productNumber) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productNumber = productNumber;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productNumber=" + productNumber
				+ "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
