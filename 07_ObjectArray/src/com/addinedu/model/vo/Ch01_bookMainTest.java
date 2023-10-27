package com.addinedu.model.vo;

import java.util.Scanner;

public class Ch01_bookMainTest {

	public static void main(String[] args) {
		Ch01_book b = new Ch01_book();
	
		b.setAuthor("김이박");
		b.setEditor("몰라유");
		b.setPrice(120000);
		b.setTt("사랑밖에 난 몰라");
		
		System.out.println(b.info());
		
		Ch01_book b2 = new Ch01_book("카페라떼","카페모카",15000,"바닐라라떼");
		
		System.out.println(b2.info());
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("책 제목 : ");
		
		Ch01_book book1 = new Ch01_book();
		String search = scan.nextLine();
		book1.setTt("사랑밖에 난 몰라");
		
		if(book1.getTt().equals(search)) {
			System.out.println(search);
		}else {
			System.out.println("제목이 다르다유!!");
		}
		
	}

}
