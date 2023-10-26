package obj03_Method;

public class Ch05_method_overloading {
	//5칙연산 메소드
	int add(int x , int y) {
		int re = x+y;
		return re;
	}
	void add(int x) {
		System.out.println("int 하나");
		System.out.println(x + "+ 10 = " + (x+10));
	}
	void add(double x , double y) {
		System.out.println("double + double");
		System.out.printf("%.2f\n",(x+y));
	}
	int minus(int x , int y) {
		int re = x-y;
		return re; 
	}
	double minus(double x , double y , int z ) { // 생성자를 통한 초기화
		return x - y - z ;
	}
	int multiplication(int x , int y) {
		int re = x*y;
		return re;
	}
	int divide(int x , int y) {
		int re = x/y;
		return re;
	}
	int remain(int x , int y) {
		int re = x%y;
		return re;
	}
	
	
	public void calculateWithOperator(char operator, int... numbers) {
		
		String message = "" + numbers[0];
		int result = numbers[0];
		
		for (int i = 1; i < numbers.length; i++) {
			switch(operator) {
				case '+': result += numbers[i]; break;
				case '-': result -= numbers[i];	break;
				case 'X': result *= numbers[i];	break;
				case 'x': result *= numbers[i];	break;
				case '/': result /= numbers[i];	break;
				case '%': result %= numbers[i];	break;
			}
			message += operator + "" + numbers[i];
		}
		
		message += "=" + result;
		System.out.println(message);
	}
}
