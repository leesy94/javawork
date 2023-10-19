package casting03;

import java.util.Scanner;

public class Ch03_castingOP {

	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;

		byte sum = (byte) (b1 + b2);
		int sum2 = b1 + b2;

		char c1 = 'a';
		char c2 = (char) (c1 + 1); // b 출력
		int c3 = c1 + 1; // 유니코드로 변환 (98)

		System.out.println(c2 + "," + c3);

		int int1 = 3450;
		int int2 = 567;

		int sum3 = int1 / int2;
		System.out.println(sum3);

		int int3 = 3450;
		double dou1 = 567;
		double sum4 = int3 / dou1;
		System.out.println(sum4);

		System.out.println("--------------------------");
		System.out.println("1번.");
		Scanner scan = new Scanner(System.in);
		System.out.print("사과는 영어로? : ");
		String apple = scan.next();
		
		char sen = apple.charAt(0); 
		char sen1 = apple.charAt(1); 
		char sen2 = apple.charAt(2); 
		System.out.println(sen);
		System.out.println(sen1);
		System.out.println(sen2);
		
		System.out.println("--------------------------");
		System.out.println("2번.");
		
		System.out.print("문자 : ");
		
		int a1 =  scan.next().charAt(0); 
		//char a1 = scan.next().charAt(0); 
		System.out.println(a1);
		
		System.out.println("--------------------------");
		System.out.println("3번.");
		
		System.out.print("국어: ");
		int korean = scan.nextInt();
		System.out.print("영어: ");
		int english = scan.nextInt();
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.println("국어,영어,수학 :");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		
		
		int sum1 = (korean+english+math) ;
		
		System.out.println("총점 : " + sum1);
		System.out.printf("평균 : %.2f\n" , sum1/3.0);

		System.out.println("--------------------------");
		System.out.println("4번.");

		int iNum1 = 10;
		int iNum2 = 4;

		float fNum = 3.0f;

		double dNum = 2.5;

		char ch = 'A';

		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2

		System.out.println(iNum2 * dNum); // 10.0
		System.out.println((double) iNum1); // 10.0

		System.out.println((double) (iNum1 / iNum2)); // 2.5
		System.out.println(dNum); // 2.5

		System.out.println((int) fNum); // 3
		System.out.println((int) (iNum1 / fNum)); // 3

		System.out.println((float) (iNum1 / fNum));// 3.3333333
		System.out.println((double) iNum1 / fNum); // 3.3333333333333335

		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println((int) ch + iNum1); // 75 => 강제형변환
		System.out.println((ch + iNum1)); // 75 => 자동형변환
		System.out.println((char) (ch + iNum1)); // 'K'

	}

}
