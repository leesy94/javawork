package op01;

public class Ch04_logical {

	public static void main(String[] args) {
		// 논리합 , 논리곱
		// &&(논리합) => 두 조건 모두 만족해야됨
		// ||(논리곱) => 또는, 둘 중 하나 참 이면 참
		
		/*
		 * 비트연산자
			2 | 3 = 3
			00000010
			00000011
			--------
			00000011 => 3
		*/
	
		char i = 'k';
		System.out.println("소문자 ? "+ (i >= 'a' && i <= 'z'));
		System.out.println("대문자 ? "+ (i >= 'A' && i <= 'Z'));
		
		int j = 100_100_100; //가능, 보기 편하게
	
	}

}
