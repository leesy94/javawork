package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch04_LibraryController{
	//private Ch04P_Member mem = new Ch04P_Member();
	//Ch04P_Member m = new Ch04P_Member();
	private ArrayList<Ch04_Book> bList = new ArrayList<Ch04_Book>() ;
	/*private ArrayList<Ch04P_Member> mList = new ArrayList<Ch04P_Member>() ;
	
	//멤버추가
	void insertMember() {
		Scanner scan = new Scanner(System.in);
		System.out.print("멤버 이름 : ");
		String name = scan.next();
		System.out.print("멤버 나이 : ");
		int age = scan.nextInt();
		System.out.print("멤버 성별 : ");
		char gender = scan.next().charAt(0);
		
		m.setName(name);
		m.setAge(age);
		m.setGender(gender);
		
		//bList.add(mem.setName(name));
		//bList.add(mem.setAge(age));
		//bList.add(mem.setGender(gender));
		mList.add(m);
		
		//System.out.println(mList);
	}*/
	Ch04P_Member mem = new Ch04P_Member();
	public void insertMember(Ch04P_Member m) {
		this.mem = m ;
	}
	
	//멤버인포
	public void myInfo() {
		System.out.println(mem);
	}
	
	//북추가
	public void inserBook() {
		bList.add(new Ch04_Book("java","신용권","한빛미디어"));
		bList.add(new Ch04_Book("오라클","권용신","빛한미디어"));
		bList.add(new Ch04_Book("리엑트","신권용","미디어한빛"));
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("책 제목 : ");
		String tt = scan.next();
		System.out.print("저자명 : ");
		String author = scan.next();
		System.out.print("출판사명 : ");
		String publisher = scan.next();
		
		Ch04_Book b = new Ch04_Book();
		b.setTitle(tt);
		b.setAuthor(author);
		b.setPublisher(publisher);
		
		bList.add(b);*/
	}
	public ArrayList<Ch04_Book> selectAll() {
		return bList;
	}
	
	public Ch04_Book searchBook(String keyword) {
		Ch04_Book book = null;
		
		for(int i = 0 ; i < bList.size() ; i++) {
			if(keyword.equals(bList.get(i).getTitle())) { 
				//private 값을 가져오려면 getter, setter 활용
				book = bList.get(i) ;
				break;
			} else {
				//book = "책이 없습니다." ;
				//System.out.println("책이 없습니다.");
			}			
		}
		
		return book ;
	}
	
	public int rentBook(int index) {
		return index;
	}

}
