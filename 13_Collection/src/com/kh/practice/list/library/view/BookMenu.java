package com.kh.practice.list.library.view;

import java.util.Scanner;

public class BookMenu {
	/*- sc:Scanner = new Scanner(System.in)
	- bc : BookController = new BookController()
	+ mainMenu() : void
	+ insertBook() : void
	+ selectList() : void
	+ searchBook() : void
	+ deleteBook() : void
	+ ascBook() : void*/
	
	public void mainMenu() {
		//사용자가 직접 메인 메뉴를 선택	할 수 있음. 종료 전까지 반복 실행. 
		//각 메뉴를 누를 시 해당 메소드로 이동.
		System.out.println("== Welcome KH Library ==\n");
		int num = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.print("=====***** 메인 메뉴 *****=====\n");
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
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : 
				System.out.println("프로그램 종료");
				return;
			default :
				System.out.println("메뉴가 없습니다. 다시 입력해주세요.");
			}
		}
	}
	void insertBook() {
		//도서 추가를 위해 정보를 받는 메소드
	} 
	void searchBook() {
		//전체 도서 목록 출력 성공을 알리는 메소드
	}
	void deleteBook() {
		//특정 도서 삭제 성공을 알리는 메소드
	}
	void ascBook() {
		//책 명 오름차순 정렬 성공을 알리는 메소드
	}
}
