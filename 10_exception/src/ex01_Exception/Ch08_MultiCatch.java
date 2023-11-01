package ex01_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch08_MultiCatch {
	
	public static void main(String[] args) {
		try {
		String[] strNum = {"a","3","erwrf"};
		int num = Integer.parseInt(strNum[2]);
		System.out.println(strNum[4]);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num2 = scan.nextInt();
		} catch (InputMismatchException im) {
			System.out.println("배열의 범위 넘어섬");
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("입력값은 정수로 넣으셈");
		} catch (NumberFormatException nf) {
			System.out.println("정수로 변환 할 수 없음");
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		try {
		
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException | InputMismatchException e) {
			
		}
	}
}
