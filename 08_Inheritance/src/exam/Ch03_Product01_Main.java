package exam;

public class Ch03_Product01_Main {

	public static void main(String[] args) {
		//Ch03_Product pd = new Ch03_Product();
		Ch03_Buyer b = new Ch03_Buyer();
		b.buy(new Ch03_Product(5000));
		b.buy(new Ch03_Computer(0));
		b.buy(new Ch03_Game(0));
		b.buy(new Ch03_tv(0));
		
		System.out.println("현재 남은 돈 : "+b.money + "만원입니다.");
		System.out.println("현재 남은 포인트 : "+b.bonus + " 입니다.");
	}

}
