package var01;

public class Ch02_double {

	public static void main(String[] args) {
		double db1 = 12.345;
		double db2 = 67.891;
		System.out.println(db1+" , "+db2);
		
		// double / double = double
		// double / int = double
		// int / int = int
		
		System.out.println(db2/db1);
		System.out.println(10/3); // int int => int
		System.out.println(10/3.0); // int double => double
		System.out.println(9/3.0);
		
		int num1 = 10;
		int num2 = 4 ;
		
		System.out.println(num1+ " % " + num2 + "의 나머지 = " + num1 % num2); // % 나머지
	}

}
