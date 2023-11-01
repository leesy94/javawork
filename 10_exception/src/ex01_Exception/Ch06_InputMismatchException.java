package ex01_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch06_InputMismatchException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수3개");
		
		int sum = 0;
		
		for(int i = 0 ; i < 3;i++) {
			try	{
				System.out.print((i+1)+"번째 정수 : ");
				int num = scan.nextInt() ;
				sum += num;
			}catch(InputMismatchException im) {
				System.out.println("정수만 입력!!");
				scan.next();
				i--;
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/3.0);
	}

}
