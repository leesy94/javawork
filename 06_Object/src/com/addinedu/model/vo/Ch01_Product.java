package com.addinedu.model.vo;

public class Ch01_Product {
	String productId ;
	String productName ;
	String productArea ;
	int price ;
	double tax ;
	
	public Ch01_Product() {}
	
	public Ch01_Product(String productId , String productName ,String productArea, int price,double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public void setId(String productId) { // 패키지가 다를경우 public으로 불러오기 
		this.productId = productId;
	}
	public void setName(String productName) {
		this.productName = productName;
	}
	public void setArea(String productArea) {
		this.productArea = productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getId() {
		return productId; 
	}
	public String getName() {
		return productName; 
	}
	public String getArea() {
		return productArea; 
	}
	public int getPrice() {
		return price; 
	}
	public double getTax() {
		return tax; 
	}
	
	public String info() {
		return productId + ", " + productName + ", " + productArea + ", " + price + ", " + tax;
	}
}
