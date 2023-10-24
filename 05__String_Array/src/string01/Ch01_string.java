package string01;

public class Ch01_string {

	public static void main(String[] args) {
		String name = "홍길동";
		String hobby = "동에번쩍";

		String str = "java";
		String str2 = "java" ;
		System.out.println(str == str2); // 주소가 같은가?
		//class는 앞글자 대문자
		
		String str3 = new String("java"); // new 무조건 객체생성
		String str4 = new String("java");
		
		System.out.println(str3 == str4);
		
		//문자열만 비교하고 싶을땐 .equals
		System.out.println(str3.equals(str4));	// true
		
		
		
		
		/////////////     형변환      ////////////////
		
		System.out.println("----------- 형변환 -----------"); 
		//string -> int (변환) ===> int value = integer.parseInt(value);
		//문자 -> 숫자
		String str1 = "100";
		int num1 = Integer.parseInt(str1);
		double num2 = Double.parseDouble(str1);
		
		System.out.println(str1 + 10); 
		System.out.println(num1 + 10); //형변환 완료
		System.out.println(num2 + 10.00); //형변환 완료
		
		//숫자 -> 문자
		int num3 = 50;
		String str1_1 = String.valueOf(num3);
		System.out.println(str1_1 + 90); //형변환 완료

		

	}

}
