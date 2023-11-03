package obj01;

import java.util.Date;

public class Ch06_getClass {

	public static void main(String[] args) {
		Card c = new Card("신한",24232523);
		
		Class obj = new Card().getClass(); // 객체 얻어오기
		Class obj2 = c.getClass();
		try {
			Class obj3 = Card.class.forName("Card");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c);
		System.out.println(obj.getName());
		System.out.println(obj.toString());
	}

}
