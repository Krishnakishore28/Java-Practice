package com.wipro.Hibernate3;

public class Flower {
	private int flowerId;
	private String flowerName;
	private String color;
	private int price;
	public int getFlowerId() {
		return flowerId;
	}
	public void setFlowerId(int flowerId) {
		this.flowerId = flowerId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		flowerName = flowerName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flower [flowerId=" + flowerId + ", FlowerName=" + flowerName + ", color=" + color + ", price=" + price
				+ "]";
	}
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
