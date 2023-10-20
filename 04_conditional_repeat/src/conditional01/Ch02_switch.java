package conditional01;

import java.util.Scanner;

public class Ch02_switch {

	public static void main(String[] args) {
		
		// 경우의 수가 정해진 경우 등록
		
		int i = 3;
		
		switch(i) {
			case 1:
				System.out.println("true");
				break; // switch문 탈출 , 밑에 것들 실행하지  않음
			case 2:
				System.out.println("false");
				break;
			default : //else 같은 개념
				System.out.println("???");
		}

	
		char c = 'k';
		
		switch(c) {
			case 'k':
				System.out.println("김씨");
				break;
			default :
				System.out.println("김씨 아님");
		}
		
		int m = 10 ;
		
		switch(m) {
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;	
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;	
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;	
		}
	
		System.out.println("----------------------------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("연산자(+,-,*,/,%) : ");
		String a = scan.next();
		
		System.out.print("숫자1 : ");
		int num1 = scan.nextInt();
		
		System.out.print("숫자2 : ");
		int num2 = scan.nextInt();
		
		switch(a) {
			case "+" :
				System.out.println(num1 + num2);
				break;
			case "-" :
				System.out.println(num1 - num2);
				break;
			case "*" :
				System.out.println(num1 * num2);
				break;
			case "/" :
				System.out.println(num1 / num2);
				System.out.printf("%d/%d=%.2f\n",num1,num2,(double)num1/num2);
				System.out.printf("%d%s%d=%.2f\n",num1,a,num2,(double)num1/num2);
				break;
			case "%" :
				System.out.println(num1 % num2);
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
		}
		
		
		
	
	}

}
