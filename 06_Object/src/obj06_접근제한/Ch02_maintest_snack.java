package obj06_접근제한;

import java.util.Scanner;

public class Ch02_maintest_snack {

	public static void main(String[] args) {
		Ch02_snack s1 = new Ch02_snack();
		Ch02_snack s2 = new Ch02_snack("초콜릿","페레레로쉐","헤이즐넛향",1,2500);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("과자 종류 : ");
		s1.setKind(scan.next());
		//s2.setKind(scan.next());
		System.out.print("과자 이름 : ");
		s1.setName(scan.next());
		System.out.print("과자 맛 : ");
		s1.setFlavor(scan.next());
		System.out.print("과자 개수 : ");
		s1.setNumof(scan.nextInt());
		System.out.print("과자 가격 : ");
		s1.setPrice(scan.nextInt());
		
		//System.out.println("kind 정보 : "+s1.getKind());
		System.out.println("s1의 정보 : "+s1.info());
		System.out.println("s2의 정보 : "+s2.info());
	
		///s1 객체의 수량, 금액 변경
		
		System.out.print("s1 과자 개수 : ");
		s1.setNumof(scan.nextInt());
		System.out.print("s1 과자 가격 : ");
		s1.setPrice(scan.nextInt());
		
		System.out.print("s2 과자 이름 : ");
		s2.setName(scan.next());
		System.out.print("s2 과자 가격 : ");
		s2.setPrice(scan.nextInt());
		
		System.out.println("s1의 정보 : "+s1.info());
		System.out.println("s2의 정보 : "+s2.info());
		//System.out.println("s1의 정보 : "+s1.info());
		
		
	
	}

}
