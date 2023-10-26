package obj05_static;

public class Ch01_Static_member {
	//instance field
	int num = 1; //명시적 초기화
	
	//static field
	static int sNum = 2 ;
	static String SName = "가나다"; // 정적필드(클래스필드)
	
	static void sme3() {
		System.out.println(SName);
	}
	//정적 메소드와 필드만 호출가능
	static int sme4() {
		System.out.println("정적 메소드");
		return 4;
	}
	//인스턴스 메소드는 둘 다 가능
	{
		sNum = 3;
		
	}
}
