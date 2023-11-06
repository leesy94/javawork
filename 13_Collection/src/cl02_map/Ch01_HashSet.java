package cl02_map;

import java.util.* ;

public class Ch01_HashSet {

	public static void main(String[] args) {
		Object[] oArr = {"1","3","5","7","11","11","11","11","11"}; 
		
		Set set1 = new HashSet(); //같은 값 없애버림
		
		for(Object obj : oArr) {
			set1.add(obj);
		}
		System.out.println(set1.size());
	}

}
