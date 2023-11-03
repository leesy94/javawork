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
	
	String title;
	String author;
	String category;
	int price;

	Book() {}
	Book(String title , String author, String category, int price) {
		//매개변수가 있는 생성자
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
		
	}
	
	@Override
	public String toString() {
		//객체의 정보를 리턴하는 메소드
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		//해시코트를 리턴하는 메소드
		return Objects.hash(author, category, price, title);
	}
	@Override
	public boolean equals(Object obj) {
		//객체가 같은지 여부를 리턴하는 메소드
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(category, other.category) && price == other.price
				&& Objects.equals(title, other.title);
	}
	public int compareTo(Object o) {
		//정렬 기준을 가지고 있는 메소드
		return price;
		
	}


}

