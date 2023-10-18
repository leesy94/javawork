package var01;

public class Ch01_int {

	public static void main(String[] args) {
		int num1 = 30;
		System.out.println("num1 = " + num1);
		
		int num2 = 100;
		System.out.println("num2 = " + num2);
		
		int sum = num1 + num2 ;
		
		System.out.println("sum = " + sum);
		
		int sum2 = sum * 100 ;
		System.out.println("sum2 = " + sum2);
		
		System.out.println("-----------------------------------------");
		System.out.println("num1+num2 = " + (num1+num2));
		System.out.println("num1+sum = " + (num1+sum));
		System.out.println("num1*sum-num2 = " + (num1*sum-num2));
		System.out.println("num1*(sum-num2) = " + (num1*(sum-num2)));
	}

}
