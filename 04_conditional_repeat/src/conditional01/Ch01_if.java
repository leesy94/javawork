package conditional01;

import java.util.Scanner;

public class Ch01_if {

	public static void main(String[] args) {
		// if else 
		Scanner scan = new Scanner(System.in);
		//System.out.print("점수 : ");
		
		//int i = scan.nextInt();
		int i = 5;
		
		if( i >= 90 ) 
			System.out.println("수");
		else if( i >=80 && i < 90)
			System.out.println("우");
		else if( i >=70 && i < 80)
			System.out.println("미");
		else 
			System.out.println("가");
		
		
		if(i > 100) {
			System.out.println("축하합니당.");
			if(i > 150) {
				System.out.println("100점만점!!\n축하합니당.");
			}
		}else {
			System.out.println("탈락입니다.\n축하합니당.");
		}
		
		
		
	}

}
