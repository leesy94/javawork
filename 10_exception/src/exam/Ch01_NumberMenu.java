package exam;

import java.util.Scanner;

public class Ch01_NumberMenu {
	public void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = scan.nextInt();
		
		Ch01_NumberController nc = new Ch01_NumberController();
		
		try{
			nc.check(num1,num2);
		}catch(Ch01_NumRangeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
