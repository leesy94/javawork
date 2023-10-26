package com.addinedu.run;

import com.addinedu.model.vo.Ch02_Book;

public class Ch02_BookMainTest {

	public static void main(String[] args) {
		Ch02_Book book = new Ch02_Book("그리스인 조르바",13000,0.0005,"그리스인");
		Ch02_Book book2 = new Ch02_Book("그대들 어떻게 살것인가",13000,0.234245,"일본인");
	
		double newprice = book.getPrice() - (book.getPrice() * book.getDiscount());
		//book.getPrice() ;
		
		
		System.out.println(newprice);
		System.out.println(book2.info());
	
	
	
	}

}
