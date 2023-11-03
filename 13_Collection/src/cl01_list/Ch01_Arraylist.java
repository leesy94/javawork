package cl01_list;

import java.util.ArrayList;
import java.util.List;

public class Ch01_Arraylist {

	public static void main(String[] args) {
		/*
		 * ArrayList<>
		 * <제네릭> => 자료형이 무엇이 들어올지 모름 , 사용할때 자료형 넣음
		 * 갯수를 지정하지 않으면 기본 10개
		 * */
		// 갯수지정 가능
		ArrayList<String> alist = new ArrayList<>(15);
		
		//부모형으로 변환
		List<String> list = new ArrayList<>(); // arraylist 등은 항상 list에서 상속
		list.add("java");
		list.add("oracle");
		list.add("html5");
		list.add("jsp");
		
		int size = list.size();
		System.out.println(size);
		
		list.add(2,"Spring");//추가
		list.set(2, "SpringBoot"); //변경
		
		System.out.println(list.get(2)); 
		System.out.println(list.size());
		
		list.remove(0) ; // 삭제
		//boolean re = list.remove("html5");
		//System.out.println(re);
		
		for(int i = 0; i< list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		list.clear();
		System.out.println(list.isEmpty());
		
		////////////////////////////////////////////////////
		//매개변수에 모든 객체를 받을때 <object>
		ArrayList alist2 = new ArrayList();
		alist2.add(1);
		alist2.add(3.12342421421);
		alist2.add("342");
		alist2.add(new String("3565646"));
		
		Object obj1 = alist2.get(0);
		int num = (int)obj1;
		
		double dou = (double)alist2.get(1);
		int strnum = Integer.parseInt((String)alist2.get(2));
		
	}

}
