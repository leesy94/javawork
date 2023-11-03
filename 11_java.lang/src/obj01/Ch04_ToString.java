package obj01;

import java.util.Date;

class Card {
	String kind;
	int num;
	
	Card() {
		this("신용카드",33342352);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	/*@Override
	public String toString() { //tostring 나오면 이걸로 리턴
		return "kind : " + kind + " , num : "+num ;
	}*/
}

public class Ch04_ToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("신한",24232523);
		
		System.out.println(c1.toString());
		System.out.println(c1);
		System.out.println(c2.toString());
		
		String str = new String("korea");
		Date today = new Date();
		
		System.out.println(today);
	}

}
