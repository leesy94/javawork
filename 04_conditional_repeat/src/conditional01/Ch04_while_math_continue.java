package conditional01;

import java.util.Scanner;

import java.lang.Math;

public class Ch04_while_math_continue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int i = 0 ;
		while(i < 10) {
			i ++ ;			
			System.out.println(i);
			if(i == 10) {
				break;
			}
			System.out.println("break 이후"+i);
			
		}
		
		int sum = 0;
		while(i <= 100) {
			sum += i ;
			i++;
		}
		System.out.println(sum);*/

		////////////////////////////////////////////
		int sum2 = 0;
		int num = 0;

		while (sum2 < 100) {
			// sum2 += num ;
			// ++num;
			// System.out.println("num = "+num);
			sum2 += ++num;
			// System.out.println("sum2 = "+sum2);
//			if(sum2 > 100) {
//				break;
//			}

		}
		System.out.println("합이 100이상이 되는 최소 합계 일 때 최대수 = " + num);
		System.out.println("& 100이상이 되는 최소 합계  = " + sum2);

		//////////////////////////////////////////////
		/*Scanner scan = new Scanner(System. in);
		System.out.print("숫자와 입력자 입력 *멈주고 싶으면 '@' (ex) + 4 9 :");
		while(true) {
			char op = scan.next().charAt(0);
			int i = scan.nextInt();
			int j = scan.nextInt();
			
			if(op == '@') {
				break;
				
			}
			System.out.println(i + "" + op + j + "="+ (i + j));
			// 사칙연산자 받아와도 계산안됨, 그냥 case 문이나 els if 써야됨
		}*/

		/////////////////////////////////////////////////// dowhile

		int i = 1;

		do {
			// System.out.println(i);
			i++;
		} while (i < 10);
		// System.out.println("count 값이 10이면 반복문 종료 count 값: "+i);

		// Object math;

		///////////////////////////////////////////////////// math

		double mr = java.lang.Math.random(); // 0~0.9999999999 랜덤으로 나옴
		double mr2 = java.lang.Math.random() * 5; // 0 ~ 4.9999999999
		// System.out.println((int)mr2);

		System.out.println("---------------------------------");

		/*double dice = java.lang.Math.random() * 5 + 2 ;
		int d_num ;
		//System.out.println((int)dice);
		do {
			System.out.print("숫자 :");
			d_num = scan.nextInt() ; 
			
			if(d_num == (int)dice) {
				System.out.println("성공!");
				break;
			}else {
				System.out.println("실패! 입력값 : "+d_num+" / 호출값 : "+ (int)dice);
			}
		}while(dice != d_num);*/

		////////////////////////////////////////////// continue

		// break : 반복문 빠져나올 때
		// continue : continue 하위의 실행문을 실행하지 않고 반복문을 다시 실행
		// ~ 제외 할 때 많이 사용

		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 3 == 0)
				continue;

			sum += j;

		}
		System.out.println("3의 배수를 제외한 합계 : " + sum);

		System.out.println("---------------------------------");
		System.out.println("1번.");
		
		int sum3 = 0 ;
		for(int a = 0; a <= 100 ; a++) {
			if(a % 3 == 0)
			sum3 += a;
		}
		System.out.println("3의 배수 합계 : " + sum3);
		
		System.out.println("---------------------------------");
		System.out.println("2번.");
		
		
		int sum4 = 0 ;
		int num2 ;
		do {
			System.out.print("숫자 :");
			num2 = scan.nextInt();
			
			if(num2 < 0) {
				System.out.println("양수를 입력해주세요.");
			}else {
			
				for(int b = 0 ; b <= num2 ; b++) {
					sum4 += b ;
				}
			System.out.println(num2+"까지의 합계 : "+sum4);
			}
		}while(num2 < 0) ;
		
		System.out.println("---------------------------------");
		System.out.println("3번.");
		
		
			/*1~100까지 숫자를 맞추기 게임
			랜덤으로 1~100까지의 숫자를 추출하고
			scan으로 사용자로 부터 숫자를 입력받아 숫자 맞추기
			 
			ex)
			랜덤 추출한 숫자 : 5
			숫자를 입력하세요 : 10
			더 작은 숫자를 입력해보세요
			숫자를 입력하세요 : 2
			더 큰숫자를 입력해보세요
			숫자를 입력하세요 : 5
			축하합니다 맞췄습니다 종료*/
		
		int un;
		int collect ;
		collect = (int)(Math.random() * 100);
		do {
			System.out.print("숫자 입력 :");
			un = scan.nextInt();			
			
			System.out.println(collect);
			
			if(un == collect) {
				System.out.println("맞췄습니다! 축하합니다!");
				break;
			}else if(un < collect) {
				System.out.println("더 큰숫자를 입력해보세요");
			}else if(un > collect) {
				System.out.println("더 작은 숫자를 입력해보세요");
			}
			
		}while(un != collect);
		
		
		System.out.println("---------------------------------");
		System.out.println("4번.");
		
		/*
		 	사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
			단, 입력한 수는 1보다 크거나 같아야 합니다. 
			ex.
			1이상의 숫자를 입력하세요 : 0
			1 이상의 숫자를 입력해주세요.
		
			1이상의 숫자를 입력하세요 : 4			
			4 3 2 1*/
		
		int pn ;
		
		do {
			System.out.print("숫자 입력 :");
			pn = scan.nextInt();
			
			if(pn < 0) {
				System.out.println("양수를 입력해주세요.");
				//break;
			}else {
				for(int c = pn ; c > 0 ; c--) {
					if(c > 0) {
						if(c != 1) {
							System.out.print(c+",");
							continue;
						}else {
							System.out.print(c + "\n");
						}
					}else {
						System.out.println("뇨롱");
					}
				}
				//System.out.println();
			}
			
		}while(pn < 0);

		System.out.println("---------------------------------");
		System.out.println("5번.");

		/*
			사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
			만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
			ex
			첫 번째 숫자 : 9
			두 번째 숫자 : 0
			1 이상의 숫자를 입력해주세요.
			
			첫 번째 숫자 : 8
			두 번째 숫자 : 4 
			4, 5, 6, 7, 8,
		*/

		int num05_1;
		int num05_2;

		do {
			System.out.print("숫자 1 입력 :");
			num05_1 = scan.nextInt();
			System.out.print("숫자 2 입력 :");
			num05_2 = scan.nextInt();
			
			/*
			System.out.print("숫자 두 개를 입력 : ex) 33 55 : ");
			num05_1 = scan.nextInt();
			num05_2 = scan.nextInt();
			=> 이렇게 써두됨
			*/
			
			if (num05_1 < 1 || num05_2 < 1) {
				System.out.println("양수를 입력해주세요.");
				continue;
				//break;
			} else {
				if (num05_1 > num05_2) {
					for (int d = num05_2; d <= num05_1; d++) {
						if (num05_2 <= d) {
							if (num05_1 > d) {
								System.out.print(d + ",");
								//continue;
							} else {
								System.out.print(d);
							}
						}
					}
				} else {
					for (int d = num05_1; d <= num05_2; d++) {
						if (num05_1 <= d) {
							if (num05_2 > d) {
								System.out.print(d + ",");
								//continue;
							} else {
								System.out.print(d);
							}
						}
					}
				}
			}
			System.out.println();

		} while (num05_1 < 1 || num05_2 < 1);
		
		// 5번문제 이렇게도 풀 수 있음
		boolean change = true;
		while(change) {
			
			System.out.print("숫자 두 개를 입력 : ex) 33 55 : ");
			num05_1 = scan.nextInt();
			num05_2 = scan.nextInt();

			if (num05_1 < 1 || num05_2 < 1) {
				System.out.println("양수를 입력해주세요.");
				continue;
			}
			//자리 바꾸기
			if(num05_1 > num05_2) {
				int tmp = num05_1;
				num05_1 = num05_2;
				num05_2 = tmp;
			}
			
			for(int e = num05_1 ; e <=num05_2 ; e++) {
				System.out.print(e + ", ");
			}
			
			change = false;
			
		}

	}

}
