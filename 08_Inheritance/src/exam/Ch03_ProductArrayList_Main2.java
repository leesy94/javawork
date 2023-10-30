package exam;

public class Ch03_ProductArrayList_Main2 {

	public static void main(String[] args) {
		Ch03_Buyer3 b = new Ch03_Buyer3();
		Ch03_tv tv = new Ch03_tv(0);
		Ch03_Computer com = new Ch03_Computer(0);
		Ch03_Game game = new Ch03_Game(0);
		
		b.buy(tv);
		b.buy(com);
		b.buy(com);
		b.buy(com);		
		b.buy(com);
		b.buy(game);
		b.buyList();
		b.refund(game);
		b.buyList();
	}

}
