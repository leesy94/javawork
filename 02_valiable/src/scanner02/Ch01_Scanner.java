package scanner02;

import java.util.Scanner;

public class Ch01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
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
		System.out.println(address);
	}

}
