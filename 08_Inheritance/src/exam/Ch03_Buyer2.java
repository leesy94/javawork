package exam;

public class Ch03_Buyer2 {
	int money = 10000000;
	int bonus;
	int count;	
	Ch03_Product[] proList = new Ch03_Product[3] ;
	
	
	void buy(Ch03_Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
			money -= p.price;
			bonus += p.bonus;
			proList[count++] = p ;
			
			System.out.println(p + " 구입");
		
		
	}
	void buyList() {
		//물건리스트
		//물건 총 합계
		int sum = 0;
		String list = "";
		
		for(int i = 0 ; i < proList.length;i++) {
			sum += proList[i].price;
			list += proList[i]+",";
		}
		
		/*for(Ch03_Product pro : proList) {
			sum += pro.price;
			list += pro+toString();
		}*/
		
		System.out.println("물건 총 합계 : "+sum+ " / 물건리스트 : "+ list );
	}
}
