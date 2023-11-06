package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	/*- sc:Scanner = new Scanner(System.in)
	- bc : BookController = new BookController()
	+ mainMenu() : void
	+ insertBook() : void
	+ selectList() : void
	+ searchBook() : void
	+ deleteBook() : void
	+ ascBook() : void*/
	
	Scanner scan = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		//사용자가 직접 메인 메뉴를 선택	할 수 있음. 종료 전까지 반복 실행. 
		//각 메뉴를 누를 시 해당 메소드로 이동.
		System.out.println("== Welcome KH Library ==");
		int num = 0;
		
		while(true) {
			System.out.println("\n=====***** 메인 메뉴 *****=====\n");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료\n"); 
			System.out.print("메뉴 번호 입력 :");
			num = scan.nextInt();
	
	//		******* 메인 메뉴 *******
	//		1. 새 도서 추가 // insertBook () 실행
	//		2. 도서 전체 조회 // selectList ()
	//		3. 도서 검색 조회 // searchBook ()
	//		4. 도서 삭제 // deleteBook ()
	//		5. 도서 명 오름차순 정렬 // ascBook()
	//		9. 종료 // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
	//		메뉴 번호 선택 : >> 입력 받음
	//		메뉴 화면 반복 실행 처리
	//		잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복
		
			switch(num) {
			case 1 : 
				insertBook();
				break;
			case 2 : 
				selectList();
				break;
			case 3 : 
				searchBook();
				break;
			case 4 : 
				deleteBook();
				break;
			case 5 : 
				ascBook();
				break;
			case 9 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}
	public void insertBook() {
		//도서 추가를 위해 정보를 받는 메소드
		System.out.print("도서명 : ");
		String tt = scan.next();
		System.out.print("저자명 : ");
		String aut = scan.next();
		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int gern = scan.nextInt();
		String category;
		
		while(true) {
			if(gern == 1) {
				category = "인문" ;
				break;
			}else if(gern == 2) {
				category = "자연과학" ;
				break;
			}else if(gern == 3) {
				category = "의료" ;
				break;
			}else if(gern == 4) {	
				category = "기타" ;
				break;
			}else {
				System.out.println("장르가 잘못 입력되었습니다.");
			}
		}
		
		System.out.print("가격 : ");
		int price = scan.nextInt();
		
		Book bk = new Book(tt,aut,category,price);
		bc.insertBook(bk);
	} 
	public void selectList() {
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList = bc.selectList();
		//bc.equals(bookList);
		//System.out.println(bookList);
		//bookList.equals(bc.selectList());
		if(bookList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i = 0 ; i < bookList.size() ; i ++) {
				System.out.printf("\t%s\n",bookList.get(i));
			}
		}
	}
	void searchBook() {
		//전체 도서 목록 출력 성공을 알리는 메소드
		System.out.print("검색어(도서명) : ");
		String keyword = scan.next();
		bc.searchBook(keyword);
	}
	void deleteBook() {
		//특정 도서 삭제 성공을 알리는 메소드
		System.out.print("삭제할 도서 명 : ");
		String title = scan.next();
		System.out.print("삭제할 저자 명 : ");
		String author = scan.next();
		if(bc.deleteBook(title,author) == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}else {
			System.out.println("성공적으로 삭제되었습니다.");
		}
		
		
	}
	void ascBook() {
		//책 명 오름차순 정렬 성공을 알리는 메소드
		if(bc.ascBook() == 1) {
			System.out.println("정렬에 성공하였습니다.");
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
