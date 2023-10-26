package obj05_static;

import java.util.Scanner;

public class Ch01_maintest_Static_member {

	public static void main(String[] args) { //static 정적 메소드
		Ch01_Static_member sm = new Ch01_Static_member();
		
		sm.sme3();
		
		System.out.println("static변수 : "+ sm.SName); // 이렇게 가져올 수 있당
		System.out.println("static변수 : "+ Ch01_Static_member.SName); // 클래스명 만으로 가져올 수 있당
		
		Ch01_Static_member sm2 = new Ch01_Static_member();
		
		sm2.SName = "마바사"
;
		System.out.println("static변수 : "+ sm.SName); // 둘 다 적용
		System.out.println("static변수 : "+ sm2.SName); // 둘 다 적용
		
		
		
	} //정적 메인 메소드 끝

}
