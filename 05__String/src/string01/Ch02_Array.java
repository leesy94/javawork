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
		
		int[] array_int = new int[5] ;
		int sum = 0 ;
		for(int a = 0; a < 5 ; a++) {
			array_int[a] = (int)a * 3 ;
			sum += array_int[a];
			
		}
		System.out.println(Arrays.toString(array_int) + " 합계 : "+ sum);
		
	}

}
