package string01;

import java.util.Arrays;

public class Ch05_Array_향상된for문 {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,7};
		
		for(int result : num) {
			System.out.print(result+",");
		}
		System.out.println();
		
		//////////////////////////
		String[] name = {"가나","다라마","바사아자"};
		String name2[] = new String[3];
		int index = 0 ;
		for(String str :name) {
			name2[index++] = str;
			System.out.println(name2[index-1]);
		}
		System.out.println(Arrays.toString(name2));
		
	}

}
