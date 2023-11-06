package cl01_list;

import java.util.Iterator;
import java.util.LinkedList;

public class Ch03_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> list2 = new LinkedList<String>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(3423);
		list.add(1,777); // add(index,value)
		list.add(677);
		list.add(10342);
		
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("------------------");
		list.remove(); //맨 앞노드 삭제
		
		for(int i : list) {
			System.out.println(i);
		}
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.print(element + " : ");
		}
		
	}

}
