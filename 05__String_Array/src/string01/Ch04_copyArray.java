package string01;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ch04_copyArray {

	public static void main(String[] args) {
		
		int[] oldScore = {90,33,64,5654,22};
		int[] newScore = new int[10];
		
		/*for(int ii = 0; ii<oldScore.length;ii++) {
			newScore[ii] = oldScore[ii];
		}
		newScore[6] = 68;
		System.out.println(Arrays.toString(newScore));*/
		
		System.arraycopy(oldScore, 0, newScore, 0, oldScore.length); //[90, 33, 64, 5654, 22, 0, 0, 0, 0, 0]
		System.arraycopy(oldScore, 2, newScore, 4, 3); //[0, 0, 0, 0, 64, 5654, 22, 0, 0, 0]
		System.out.println(Arrays.toString(newScore));
		
		
		System.out.println("===============================================");
		System.out.println("1번.");
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("숫자1 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자2 : ");
		int num2 = scan.nextInt();
		System.out.print("숫자3 : ");
		int num3 = scan.nextInt();
		System.out.print("숫자4 : ");
		int num4 = scan.nextInt();
		System.out.print("숫자5 : ");
		int num5 = scan.nextInt();
		
		int[] arr = {num1,num2,num3,num4,num5};
		int sum = 0;
		for(int i = 0 ; i < 5 ;i++) {
			sum += arr[i];
		}
		
		System.out.println(Arrays.toString(arr)+" / 합계 : "+sum);
		
		System.out.println("===============================================");
		System.out.println("2번.");
		
		/*
		 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		 다시 정수를 받도록 하세요. 
		 ex)1,2,3,4,5,4,3,2,1
		*/
		
		int num ;
		//System.out.println(num);
		do {
			System.out.print("숫자 : ");
			num = scan.nextInt();
			
			if(num < 3) {
				System.out.println("다시 입력해주세요.");		
			}else {
				int sum = num*2 - 1  ;
				//System.out.println(sum);
				int[] arr2 = new int[sum]; 
			
				for(int a= 0 ;a < num ; a++ ) {
					arr2[a] = a+1;
				}
				for(int a = (sum+1)/2 ; a < sum ; a++ ) {
					//System.out.println(num);
					arr2[a] = --num;
				}
				System.out.println(Arrays.toString(arr2));
				break;
			}
			
		}while(num < 3);
		
		System.out.println("===============================================");
		System.out.println("3번.");
		
		/*
		 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		 */
		
		String[] ck = {"간장","아돈노","마라","스노우","블랙맘바","양념","뿌링클"};
		
		System.out.print("먹고싶은 치킨 종류 : ");
		String ans = scan.next();
		
		if(ans.equals(ck)) {
			System.out.println(ans+"치킨이 있습니다.");
		}else {
			System.out.println(ans+"치킨이 없습니다. 다시 골라주세요.");
		}
		
		System.out.println("===============================================");
		System.out.println("4번.");
		/*
		주민등록번호 성별자리 이후부터 *로 가리고 출력하세요.
		단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

		ex.
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		*/	
		
		System.out.print("주민번호(-포함) : ");
		String sn = scan.next();
		char[] sArr = sn.toCharArray();
		String[] sArr2 = new String[13];
		
		//System.arraycopy(sArr, 6, sArr2, 5 , 6);
		for(int i = 6 ; i < 13 ; i++) {
			sArr[i] = '*';
		}
		
		System.out.println(Arrays.toString(sArr));
		
		
		System.out.println("===============================================");
		System.out.println("5번.");
		
		boolean run = true;
		
		
		System.out.println("1.학생수 | 2.점수입력 | 3.분석 | 4.종료");
		System.out.println("-----------------------------------------");
		
		int[] scorearr = new int[3];
		
		while(run) {
			
			System.out.print("선택 : ");
			
			//int selno = Integer.parseInt(scan.nextLine());
			int selno = scan.nextInt();
			
			if(selno == 1) {
				System.out.print("학생수 : ");
				int stunum = scan.nextInt();
				
			} else if(selno == 2) {
				System.out.print("점수입력 1 : ");
				int scorenum1 = scan.nextInt();
				System.out.print("점수입력 2 : ");
				int scorenum2 = scan.nextInt();
				System.out.print("점수입력 3 : ");
				int scorenum3 = scan.nextInt();
				
				scorearr[0] = scorenum1;
				scorearr[1] = scorenum2;
				scorearr[2] = scorenum3;
				
				System.out.println(scorenum1);
				
			} else if(selno == 3) {
				
				int max =  scorearr[0];
				double avg = 0.0;
				int sum = 0;
				
				for(int i = 1; i<scorearr.length; i++) {
					if(max < scorearr[i]) {
						max = scorearr[i];
					}
					sum += scorearr[i]; 
				}
				
				avg = sum / scorearr.length;
							
				
				System.out.println("최고점수 : "+max);
				System.out.println("평균점슈 : "+avg);
				
				
			} else if(selno == 4) {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료!");
		
		
	}

}
