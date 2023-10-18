package var01;

public class Ch03_char {

	public static void main(String[] args) {
		char ch1 = '&';
		
		System.out.println(ch1);
		//"sysout" + ctrl + space
		
		char ch2 = 'A' + 1 ;
		System.out.println(ch2); // 유니코드 but 자동형변환 때문에 변수로 합 할 수 없음. ex ) ch2 + 1 => false
		
		char ch3 = 'A' + '1'; // 65 + 49 = 114 => r => 유니코드
		System.out.println(ch3);
		
	}

}
