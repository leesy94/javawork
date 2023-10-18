package scanner02;

import java.util.Scanner;

public class Ch01_Scanner {

	public static void main(String[] args) {
		/*Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next(); //문자열로 받으면 next
		System.out.println(name);
		
		System.out.print("나이 : ");
		int age = scan.nextInt(); // 정수로 받으면 nextInt
		System.out.println(age);
		
		System.out.print("키(소수점 2째자리 까지) : ");
		double high = scan.nextDouble(); 
		System.out.println(high);
		
		System.out.print("성별은 남자입니까? : ");
		boolean gender = scan.nextBoolean();
		System.out.println(gender);
		scan.nextLine();
		
		System.out.print("주소 : ");
		String address = scan.nextLine();
		System.out.println(address);*/
		
		
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("1번.");
		Scanner scan = new Scanner(System.in);
		/*String name = "이시영";
		String gender = "여자";
		int age = 28;
		double high = 158.5; */
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("성별 : ");
		String gender = scan.next();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("키 : ");
		double high = scan.nextDouble();
		
		System.out.println("키 "+high+"cm인 "+age+"살 "+gender+" "+name+"님 반갑습니다.");
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("2번.");
		int num1 = 23;
		int num2 = 7;
		
		System.out.println("23 + 7 = "+(num1+num2));
		System.out.println("23 - 7 = "+(num1-num2));
		System.out.println("23 * 7 = "+(num1*num2));
		System.out.println("23 / 7 = "+(num1/num2));
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("3번.");
		
		double wid = 13.5;
		double len = 41.7;
		
		System.out.println("면적 ="+(wid*len));
		System.out.println("둘레 ="+(wid+len)*2);
		
	}

}
