package conditional01;

import java.util.Scanner;

public class Ch03_for {

	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i++) {
			System.out.print("<"+i + "단> ");
		}
		System.out.println(" ");
		for(int i = 1 ; i <= 9 ; i++) {
			if(i % 3 == 0) {
				//System.out.println(i);
			}
			for(int j = 2 ; j <= 9 ; j++ ) {
				System.out.print(j+"x"+i+"="+(i*j)+" ");
			}
			System.out.println(" ");
			
		}
		System.out.println("---------------------------------");
		//여러 변수 사용
		int num1 ,num2 ,num3 ;
		num1=num2=num3=10 ;
		for(int d = 0 , e = 40; e > 10 ; d++ , e--) { // 조건식은 하나만! 이 경우 d,e 둘 다 30번 돔
			System.out.println("d="+d+" / e="+e);
		}
		System.out.println("---------------------------------");
		//while(true)와 동일
		//초기식, 조건문 등 없음
		
		for(;;) {
			System.out.println(num1++);
			if(num1 == 16) {
				break;
			}
		}
		System.out.println("---------------------------------");
		outter : for(int dan = 1 ; dan <= 5; dan++) {
			mid : for(int dan1 = 1 ; dan1 <= 6; dan1++) {
				for(int dan2 = 1 ; dan2 <=5 ; dan2++) {
					System.out.println(dan+","+dan1+","+dan2);
					if(dan2==3) {
						break mid;
					}
				}
				if(dan1 == 3) {
					break outter;
				}
			}
			System.out.println("mid 종료");
		}
		System.out.println("outter 종료");
		
		System.out.println("---------------------------------");
		System.out.println("1번.");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자1 : ");
		int a = scan.nextInt();
		System.out.print("숫자2 : ");
		int b = scan.nextInt();
		
		int sum = 0;
		
		if(a > b) {
			//System.out.println("b가 더 작다");
			for(int i = b ; i <= a ; i++) {				
				sum += i;
			}
			System.out.println(a+"~" + b + "의 합계 : " + sum);
			
		}else {
			//System.out.println("b가 더 크다");
			for(int i = a ; i <= b ; i++) {	
				sum += i;
			}
			System.out.println(a+"~" + b + "의 합계 : " + sum);
			
		}
		
		System.out.println("---------------------------------");
		System.out.println("2번.");
		
		System.out.print("숫자1 : ");
		int a1 = scan.nextInt();
		if(a1 > 0) {
			for(int i = 0 ; i <a1 ; i++) {
				for(int j = 0 ; j <i ; j++) {
					System.out.print("*");
				}
				System.out.println( );
			}
			
		}else {
			System.out.println("정수가 아닙니다.");
		}
		

		
		
		
		
	}

}
