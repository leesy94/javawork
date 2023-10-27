package obj07_args;

import java.util.Arrays;

public class Ch01_multiMainTest {

	public static void main(String[] args) {
		String str = concatenate("a","b","c","d"); //class 내에서는 앞에 포괄 class 안붙여도됨
		System.out.println(str);
		
		String strArr[] = {"해밀턴","알렉산더","애런 버 서"};
		System.out.println(concatenate(strArr));		
		//System.out.println(con2("/","해밀턴","알렉산더","애런 버 서"));
		System.out.println(con2("/",strArr));
		int strArr2[] = {53,66,72,11,4};
		System.out.println(Arrays.toString(strArr2) +"의 합계 : "+con3(strArr2));
	}
	
	static String concatenate(String...a) { // 배열로 들어옴
		String result = "";
		//String result = i+ a+ b + c ;
		for(String str : a) { //향상된 배열
			result += str + ",";
		};
		return result;
		//for(int i=0; i<5;i++) {};
	};
	
	static String con2(String delim, String...a) {
		String result = "";
		for(String str : a) { //향상된 배열
			result += str + delim;
		};
		return result;
	}
	
	static int con3(int...a) {
		int result = 0 ;
		int sum = 0;
		for(int str : a) { //향상된 배열
			sum += str;
			result = sum;
		};
		return result;
	}
	
	

}
