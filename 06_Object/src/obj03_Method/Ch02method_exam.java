package obj03_Method;

public class Ch02method_exam {
	//5칙연산 메소드
	int add(int x , int y) {
		int re = x+y;
		return re;
	}
	int minus(int x , int y) {
		int re = x-y;
		return re;
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
