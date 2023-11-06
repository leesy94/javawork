package cl02_map;

import java.util.HashMap;
import java.util.Scanner;

public class Ch05_HashMap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<String,String> hm = new HashMap<>();
		hm.put("myId","pw1234");
		hm.put("myId20232206","pw12340001");
		hm.put("myId2023","pw1234");
		
		System.out.print("id&pw입력 : ");
		String id = scan.next();
		String pw = scan.next();
		
		if(hm.containsKey(id)) {
			String value = (String)hm.get(id);
			//System.out.println(value);
			if(value.equals(pw)) {
				System.out.println("로그인 되었습니다.");
			}else {
				System.out.println("pw를 확인해주세요.");
			}
		}else {
			System.out.println("id를 확인해주세요.");
		}
	}

}
