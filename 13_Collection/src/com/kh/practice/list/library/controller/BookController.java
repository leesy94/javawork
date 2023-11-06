package com.kh.practice.list.library.controller;

import com.kh.practice.list.library.model.vo.Book;

import java.util.*;

public class BookController {
	List<Book> bookList = new ArrayList<Book>();
	//Book bk = new Book();
	/*- list:List = new ArrayList()
	+ BookController()
	+ insertBook(bk:Book):void
	+ selectList():ArrayList
	+ searchBook(keyword:String):ArrayList
	+ deleteBook(title:String, author:String):Book
	+ ascBook() : int*/
	
	public BookController(){
		// 초기 값 4개 추가
		bookList.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		bookList.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		bookList.add(new Book("대화의 기술", "다니엘", "인문", 17500));
		bookList.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	public void insertBook(Book bk){
		//전달 받은 bk를 bookList에 추가
		bookList.add(bk);
	}
	public ArrayList<Book> selectList(){
		//ArrayList 모든 리스트를 출력하는 메소드
		return (ArrayList<Book>) bookList; //그냥 bookList만해도됨
	}
	public void searchBook(String keyword) {
		//:ArrayList 키워드로 책을 검색하는 메소드
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i = 0; i < bookList.size();i++) {
			if(bookList.get(i).title.contains(keyword)) {
				searchList.add(bookList.get(i));
			}else {
				System.out.println("찾으시는 도서가 없습니다.");
			}
		}
		for(Book str : searchList) {
			System.out.printf("\t%s\n",str);
		}
	}
	public Book deleteBook(String title, String author){
		//:Book 책 제목과 저자 명으로 책을 삭제하는 메소드
		Book removeBook = null;
		
		for(int i = 0; i < bookList.size();i++) {
			if(bookList.get(i).title.equals(title) && bookList.get(i).author.equals(author)) {
				removeBook = bookList.get(i);
				System.out.printf("\t%s\n",bookList.get(i));
				bookList.remove(i);
				break;
			}else {
			}
		}
		
		
		return removeBook;
	}
	public int ascBook(){
		//: void 책 명 오름차순 정렬 성공을 알리는 메소드
		Collections.sort(bookList, (book1, book2) -> book1.title.compareTo(book2.title));
		//bookList.sort(null);
		//Collections.sort(bookList);
		for(int i = 0 ; i < bookList.size() ; i ++) {
			System.out.printf("\t%s\n",bookList.get(i));
		}
		return 1;
		
		/* 역순정렬
		 * bookList.sort(null);
		Comparator<Book> comp = Collections.reverseOrder();
		bookList.sort(comp);
		
		return 1;*/
	}

}
