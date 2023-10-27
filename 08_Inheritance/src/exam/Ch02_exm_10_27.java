package exam;

public class Ch02_exm_10_27 {
	int num1 = 30;
	int num2 = 20;
	String name ;
	boolean flag ;
	double numDou ;
	
	void plus() {
		int sum = num1 + num2 ;
		System.out.println(sum);
	}
	void divide() {
		double dv = (double)num1 / num2 ;
		System.out.printf("%.2f\n",dv);
	}
	public int MaxNum(int x, int y) {
		int max ;
		if(x>y) {
			max = x ;
		}else {
			max = y ;
		}
		return max;
	}
	public int EvenSum(int x , int y) {
		int sum = 0 ;
		if(x > y) {
			for(int i = y ; i <= x ; i++) {
				sum += i ;
			}
		}else {
			for(int i = x ; i <= y ; i++) {
				sum += i ;
			}
		}
		return sum;
	}
	public void scan(String operator, int...a) {
		//int operator;
		String message = "" + a[0];
		int result = a[0];
		
		for(int i = 1; i < a.length ; i++) {
			switch(operator) {
				 case "+" : result += a[i]; break ;
				 case "-" : result -= a[i]; break ;
				 case "*" : result *= a[i]; break ;
				 case "/" : result /= a[i]; break ;
				 case "%" : result %= a[i]; break ;
			}
			message += operator + "" + a[i];
		}
		message += "=" + result;
		System.out.println(message);
	}
	
}
