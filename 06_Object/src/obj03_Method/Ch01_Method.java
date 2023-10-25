package obj03_Method;

public class Ch01_Method {
	//반환형이 없는 메소드
	void print1() {
		System.out.println("반환값이 없고 매개변수가 없는 메소드");
	}
	
	int print2() {
		System.out.println("반환형이 int형이고 매개변수가 없는 메소드");
		int result = 1;
		return result;
	}
	
	String print3() {
		System.out.println("반환형이 문자열이고 매개별수 없는 매소드");
		return "return";
	}
	boolean print4() {
		System.out.println("반환형이 불리언이고 매개별수 없는 매소드");
		return true;
		/* boolean re = 5>3
		   return re;
		   */
	}
	void print5(int x) {
		System.out.println(x);
	}
	
	int print6(int x) {
		//System.out.println(x);
		int y = 10;
		return x+y;
	}
	
	String print7(int x) {
		//System.out.println(x);
		int y = x * 5;
		return y+" * 연산데스넹";
	}
	
	String print8(int x, int y) {
		//System.out.println(x);
		int re = x * y;
		return re+" = 연산데스넹";
	}
	
	void print9(String str, int z) {
		System.out.println("입력한 문자열 : "+str);
		System.out.println("입력한 int : "+z);
	}
}
