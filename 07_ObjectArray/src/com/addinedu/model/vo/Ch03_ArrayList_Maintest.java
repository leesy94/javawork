package com.addinedu.model.vo;

//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.*;

public class Ch03_ArrayList_Maintest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Ch01_book> al = new ArrayList<Ch01_book>();
		
		System.out.print("책 제목 : ");
		String tt = scan.next();
		System.out.print("책 저자 : ");
		String author = scan.next();
		System.out.print("책 가격 : ");
		int price = scan.nextInt();
		System.out.print("책 에디터 : ");
		String edit = scan.next();

		Ch01_book book = new Ch01_book(tt,author,price,edit);
		al.add(book);
	}

}
