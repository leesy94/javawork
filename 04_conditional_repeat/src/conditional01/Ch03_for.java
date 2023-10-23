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
