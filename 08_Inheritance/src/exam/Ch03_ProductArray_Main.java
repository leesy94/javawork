package exam;

public class Ch03_ProductArray_Main {

	public static void main(String[] args) {
		//Ch03_Product pd = new Ch03_Product();
		//Ch03_Buyer b = new Ch03_Buyer();
		Ch03_Buyer2 b2 = new Ch03_Buyer2();
		
		b2.buy(new Ch03_Computer(5000));
		b2.buy(new Ch03_Game(0));
		b2.buy(new Ch03_tv(0));
		b2.buyList();
	}

}
