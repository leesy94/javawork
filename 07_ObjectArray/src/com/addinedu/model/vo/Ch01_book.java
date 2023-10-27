package com.addinedu.model.vo;

public class Ch01_book {
	private String tt; 
	private String author; 
	private int price; 
	private String editor;
	
	public Ch01_book() {};
	public Ch01_book(String title,String author ,int price,String editor) {
		tt = title;
		this.author = author;
		this.price = price;
		this.editor = editor;
	}
	
	public String getTt() {
		return tt;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getEditor() {
		return editor;
	}
	public void setTt(String title) {
		tt = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	public String info() {
		return "타이틀 " + tt + " / 저자 " +author+ " / 가격 " +price+ " / 에디터 " + editor;
	}
}
