package Exam;

import java.util.ArrayList;

public class ExTest {

	public static void main(String[] args) {
		Person p = new Person();
		ArrayList<String> alist = new ArrayList<>();
		
		p.setPerson("이름이름", 28, "010-3333-5555", "부산시 연제구");
			
		alist.add(p.toString());
		
		System.out.println(alist);
	}

}
