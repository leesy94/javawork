package com.addinedu.model.vo;

import java.util.Scanner;

public class Ch02_BookArray_MainTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ch01_book[] books = new Ch01_book[3];
		
		for(int i = 0 ; i < books.length;i++) {
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("책 제목 : ");
			String tt = scan.next();
			System.out.print("책 저자 : ");
			String author = scan.next();
			System.out.print("책 가격 : ");
			int price = scan.nextInt();
			System.out.print("책 에디터 : ");
			String edit = scan.next();
			
			books[i] = new Ch01_book(tt , author , price , edit);
			System.out.println(books[i].info());
		
			
		}
		
		/////책 검색
		System.out.print("책 제목 : ");
		String search = scan.next();
		
		for(int i = 0 ; i < books.length;i++) {
			if(books[i].getTt().equals(search)) {
				System.out.println(books[i].info());
			}
		}
		//System.out.println(b2.info());
		
		
	}

}
