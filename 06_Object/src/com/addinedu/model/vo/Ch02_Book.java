package com.addinedu.model.vo;

public class Ch02_Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;

	
	public Ch02_Book() {};
	public Ch02_Book(String title , int price , double discountRate ,String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	////////////////////////////////////////////
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscount(double discountRate) {
		this.discountRate = discountRate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	////////////////////////////////////////
	public String getTitle() {
		return title; 
	}
	public int getPrice() {
		return price; 
	}
	public double getDiscount() {
		return discountRate; 
	}
	public String getAuthor() {
		return author; 
	}
	////////////////////////////////////////
	
	public String info() {
		return title + ", " + price + ", " + discountRate + ", " + author;
	}



}
