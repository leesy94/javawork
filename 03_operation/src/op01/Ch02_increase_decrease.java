package op01;

public class Ch02_increase_decrease {

	public static void main(String[] args) {
		// ++ , -- 하나씩 증가, 감소
		// 단항일 땐 연산자 위치 중요X
		
		for(int i=1;i<=10;i++){  
			System.out.println(i);
		} 
		
		System.out.println("-----------------------");
		//
		int num = 10;
		int num1 = 9;
		
		int result = ++num + --num1; // 11 + 8 = 19
		System.out.println(result);
		
		int result2 = ++num + num1--; // 11 + 9 = 20
		System.out.println(result2);

	}

}
