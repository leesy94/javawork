package com.kh.practice.list.library.model.vo;

import java.util.Objects;

public class Book {
	/*- title:String
	- author:String
	- category : String
	- price : int
	+ Book()
	+ Book(title:String, author:String,
	category:String, price:int)
	+ setter() / getter()
	+ toString() : String
	+ hashCode() : int
	+ equals() : boolean
	+ compareTo() : int*/
	
	//alt + shift + s => source 단축키
	
	public String title;
	public String author;
	String category;
	int price;

	public Book() {}
	public Book(String title , String author, String category, int price) {
		//매개변수가 있는 생성자
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		//객체의 정보를 리턴하는 메소드
		return "("+title + "/" + author + "/" + category + "/" + price+")";
	}
	@Override
	public int hashCode() {
		//해시코트를 리턴하는 메소드
		return Objects.hash(author, category, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		//객체가 같은지 여부를 리턴하는 메소드{
		if(obj instanceof Book) { //obj가 book을 상속받으면?
			Book bk = (Book)obj;
			return (bk.price == price) 
					&& (bk.title.equals(title)) 
					&& (bk.category.equals(category)) 
					&& (bk.author.equals(author));
		}
		return false;
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);*/
	}
	public int compareTo(Book o) {
		//정렬 기준을 가지고 있는 메소드
		
		//숫자비교
		//return this.getPrice() - o.getPrice();
		//문자비교
		return this.getTitle().compareTo(o.getTitle());
		/*
		 * 정수일때
		 * -1 => 음수, 0 => 같음, 1 => 양수
		 * 문자열
		 * 같으면 => 0 / 다르면 => -1,1
		 * */
	}
	
}

