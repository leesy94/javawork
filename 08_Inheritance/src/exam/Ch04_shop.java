package exam;

import java.util.ArrayList;

public class Ch04_shop {
	ArrayList<Ch04_Pet> pList = new ArrayList<>();
	String listsound = "";
	String listpattern = "";
	String listleg = "";
	
	void sound(Ch04_Pet p) {
		System.out.println(p+"의 소리 : "+p.sound);
		return;
	}
	void pattern(Ch04_Pet p) {
		System.out.println(p+"의 특성 : "+p.pattern);
		return;
	}
	void leg(Ch04_Pet p) {
		System.out.println(p+"의 다리수 : "+p.leg);
		return;
	}
	
	void buy(Ch04_Pet p) {
		pList.add(p);
		
		System.out.println(p + " 구입");
		
	}
	
	void buyList() {
		//물건리스트
		//물건 총 합계
		int sum = 0;
		String list = "";
		
		if(pList.isEmpty()) {
			System.out.println("구입내역이 없습니다.");
			return;
		}else {
			for(int i = 0 ; i < pList.size();i++) {
				Ch04_Pet p = pList.get(i);
				list += (i == pList.size()-1) ? p : p + ",";
				listsound += (i == pList.size()-1) ? p.sound : p.sound + ",";
				listpattern += (i == pList.size()-1) ? p.pattern : p.pattern + ",";
				listleg += (i == pList.size()-1) ? p.leg : p.leg + ",";
				sum += p.leg ;
			}
		
		System.out.println("동물리스트 : "+ list);
		System.out.println("동물소리 : "+ listsound);
		System.out.println("동물특성 : " + listpattern);
		System.out.println("동물다리수 : " + listleg);
		System.out.println("동물다리합계 : " + sum);
	
		}
	}
}
