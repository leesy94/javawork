package op01;

import java.util.Scanner;

public class Ch05_TernaryOp {

	public static void main(String[] args) {
		// a > b ? c : d

		Scanner scan = new Scanner(System.in);
		/*System.out.print("점수 : ");
		int sc = scan.nextInt();
		
		String score = sc > 50 ? "합격" : "불합격" ;
		System.out.println(score);
		
		String a = sc >= 90 ? "A" : sc >=80 ? "B" : sc >=70 ? "C" : "D";
		System.out.println(a);*/

		System.out.println("---------------------------------");
		System.out.println("1번.");
		System.out.print("정수 : ");
		int num = scan.nextInt();

		String result = num >= 0 ? "양수" : "음수";
		System.out.println(result);

		System.out.println("---------------------------------");
		System.out.println("2번.");

		String result2 = num > 0 ? "양수" : num == 0 ? "0" : "음수";
		System.out.println(result2);

		System.out.println("---------------------------------");
		System.out.println("3번.");

		String result3 = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result3);

		System.out.println("---------------------------------");
		System.out.println("4번.");

		System.out.print("캔디갯수 : ");
		int cn = scan.nextInt();
		System.out.print("사람수 : ");
		int pn = scan.nextInt();

		System.out.println("1인당 사탕개수 : " + cn / pn + "개");
		System.out.println("남은 사탕 수 : " + cn % pn + "개");

		System.out.println("---------------------------------");
		System.out.println("5번.");

		/*이름 : 이준기
		학년(숫자만) : 2
		반(숫자만) : 7
		번호(숫자만) : 3
		성별(M/F) : M
		성적(소수점 둘째 짜리까지) : 97.35*/

		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("학년(숫자만) : ");
		int sg = scan.nextInt();
		
		System.out.print("반(숫자만) : ");
		int sb = scan.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int sn = scan.nextInt();
		
		System.out.print("성별(M/F) : ");
		String gender = scan.next();
		
		System.out.print("성적 : ");
		float sc = scan.nextFloat();
		//String gender2 ;
		String gender2 = gender.equals("M") || gender.equals("m") ? "남학생" : "여학생"; 
		if(gender == "M" && gender == "m") {
			gender2 = "남학생" ;
			System.out.println(gender+"m");
		}else {
			gender2 = "여학생" ;
			System.out.println(gender+"f");
		}
		//%.2f\n	
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다." , sg,sb,sn,name,gender2,sc);
		
		System.out.println("---------------------------------");
		System.out.println("6번.");

		System.out.print("나이 : ");
		int age = scan.nextInt();

		String age2 = (age <= 13 && age >= 0) ? "어린이" : age <= 19 ? "청소년" : "성인";
		System.out.println(age2);

		System.out.println("---------------------------------");
		System.out.println("7번.");

		System.out.print("국어(숫자만) : ");
		int kor = scan.nextInt();

		System.out.print("영어(숫자만) : ");
		int eng = scan.nextInt();

		System.out.print("수학(숫자만) : ");
		int math = scan.nextInt();

		int sum = kor + eng + math;
		double sum2 = (double) (sum / 3);

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum2);

		String sc_re = (kor >= 40 && eng >= 40 && math >= 40) && sum2 >= 60 ? "합격" : "불합격";

		System.out.println(sc_re + "입니다.");

		System.out.println("---------------------------------");
		System.out.println("8번.");

		System.out.print("주민번호(-포함) : ");
		// String ssn2 = scan.next();
		char ssn = scan.next().charAt(7);
		
		String sex = ssn == '2' || ssn == '4' ? "여성": "남성";
		System.out.println(sex);
	}

}
