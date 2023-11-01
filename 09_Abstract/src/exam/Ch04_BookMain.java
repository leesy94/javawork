package exam;

import java.util.ArrayList;

public class Ch04_BookMain {

	public static void main(String[] args) {
		//Ch04_Book book = new Ch04_Book();
		//Ch04P_Member mem = new Ch04P_Member();
		Ch04_LibraryController lc = new Ch04_LibraryController();
	
		lc.inserBook();
		//lc.insertMember("홍길자",24,'여');
		ArrayList<Ch04_Book> bList = lc.selectAll();
		for(int i = 0 ; i < bList.size();i++) {
			System.out.println(bList.get(i));
		}
		//lc.myInfo();
		Ch04P_Member mem = new Ch04P_Member("홍길자",24,'여');
		lc.insertMember(mem);
		lc.myInfo();
	
		Ch04_Book searchbook = lc.searchBook("오라클");
		//System.out.println(searchbook);
		
		if(searchbook == null) {
			System.out.println(lc.searchBook("책이 없습니다."));
		}else {
			System.out.println(searchbook);
		}
		
		int index = lc.rentBook(4);
		if(bList.size() < index) {
			System.out.println("대여 불가능합니다.");
		}else {
			System.out.println("대여 가능합니다.");
		}
		
	}
	
}
