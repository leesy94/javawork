package exam;

public class Ch03_Buyer {
	int money = 10000000;
	int bonus;
	
	void buy(Ch03_Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}else {
		money -= p.price;
		bonus += p.bonus;
		
		System.out.println(p + " 구입");
	
		}
	}
}
