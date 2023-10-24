package string01;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch02_Array {

	public static void main(String[] args) {
		//int[] 변수명 = new int[객수]
		//int 변수명[] = new int[갯수]
		
		int[] ai = new int[10] ;
		int[] ai2 = {1,3,5,7,11,13,17,19,23,29} ;
		
		System.out.println(ai2[5]);
		
		ai2[1] = 31;
		System.out.println(ai2[1]);
		//System.out.println(ai2.length);
		
		for(int i = 0; i < ai2.length ; i++) {
			if(i != ai2.length - 1) {
				System.out.print(ai2[i]+",");
			}else {
				System.out.print(ai2[i]);
			}
			//ai[i] = i*2 ;
			//System.out.print(ai[i]);			
			
		}
		System.out.println();
		
		System.out.println("---------------------------------");
		System.out.println("1번.");
		
		int[] array_int = new int[5];
		int sum = 0 ;
		for(int a = 0; a < 5 ; a++) {
			array_int[a] = (int)a * 3 ;
			sum += array_int[a];
			
		}
		System.out.println(Arrays.toString(array_int) + " 합계 : "+ sum);
		//System.out.println(Arrays.toString(array_int));
		
		System.out.println("---------------------------------");
		System.out.println("2번. 최소,최대값 구하기");
		int num[] = {65,45,55,33,11,7,44,37,467,33};
		int max =  num[0];
		int min =  num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최대값 : "+min);
		
		
		
		//////////////////////////////////////////////////////////////////
		
		char chArr[] = {'a','a','a','b'};
		String atrArr[] = {"가","가나","가나다","가"};
		boolean bArr[] = {true,false,true};
		
		
		
		//////////////////////////////////////////////////////////////////
		System.out.println("---------------------------------");
		System.out.println("3번. 랜덤으로 1~10까지의 숫자 배열에 채우기");
		
		int arr[] = new int[10];
		
		for(int a = 1 ; a < arr.length; a++ ) {
			arr[a] = (int)(Math.random()*10) + 1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}

}
