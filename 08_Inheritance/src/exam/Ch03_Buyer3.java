package exam;

import java.util.ArrayList;

public class Ch03_Buyer3{
	int money = 10000000;
	int bonus;
	ArrayList<Ch03_Product> pList = new ArrayList<>();
	//Vector == ArrayList
	//ArrayList<Object> pList = new ArrayList<Object>(); //모든객체
	
	
	void buy(Ch03_Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
			money -= p.price;
			bonus += p.bonus;
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
				Ch03_Product p = pList.get(i);
				sum += p.price;
				list += (i == pList.size()-1) ? p : p + ",";
			}
		
		System.out.println("물건 총 합계 : "+sum+ " / 물건리스트 : "+ list );
	
		}
	}
	void refund(Ch03_Product p) {
		if(pList.remove(p)) {
			pList.remove(p);
			System.out.println(p+" 환불");
		}else {
			
		}
	}
}
