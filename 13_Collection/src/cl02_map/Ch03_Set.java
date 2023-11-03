package cl02_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.*;


public class Ch03_Set {

	public static void main(String[] args) {

		///////////////arraylist로 돌리기
		ArrayList<Integer> num = new ArrayList<>(6);
		for(int i = 0 ; i < 6 ; i++) {
			num.add((int)(Math.random()*45)+1) ;
		}
		System.out.println(num);
		
		
		
		/////////////set으로 돌리기
		Set<Integer> lotto = new HashSet();
		while(lotto.size() < 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println(lotto);
		
		
		/////////////////순서대로 출력
		List list = new LinkedList(lotto);
		Collections.sort(list);
		System.out.println(list);
		
		
		
	}

}
