package obj01;

import java.util.Arrays;

public class Ch08_String {

	public static void main(String[] args) {
		byte[] bytes = {72,101,108,108,111};
		
		String str = new String(bytes);  // 문자로 봔환
		System.out.println(str);
		
		String bookName = "자바 프로그램";
		if(bookName.indexOf("ㄴㄴ") > -1) {
			System.out.println("자바책입니당.");
		}else {
			System.out.println("해당 도서가 아닙니당.");
		}
		
		
		
		/////////////////////////////////////////
		String str4 = "java";
		String str5 = str4.concat(" 프로그램");
		String str6 = str4 + " program";
		
		boolean result = str6.contains("java");
		System.out.println(result);
		
		System.out.println(str5.replace('a', 'e'));
		
		///////////////////////////////////////////
		String str7 = "cat/dog/bird/bear";
		String[] strArr = str7.split("/");
		System.out.println(Arrays.toString(strArr));

		String[] strArr2 = str7.split("/", 3);
		System.out.println(Arrays.toString(strArr2));
		
		
		//////////////////////////////////////////
		String str8 = "You may contribute a VERSE.";
		System.out.println(str8.substring(4,7)); //마지막 인덱스는 포함 X
		
		String str9 = "123456-2468101";
		String str10 = str9.substring(0,8) + "******";
		//str9 = str10.replaceAll(str9.substring(8),"*");
		
		System.out.println(str10);
		
		//////////////////////////////
		//trim() : 공백체크
		String stTrim = "                lee";
		String stTrim2 = "sy                lee";
		System.out.println(stTrim + stTrim2);
		
		System.out.println(stTrim.trim());
		System.out.println(stTrim2.trim());
		
	}

}
