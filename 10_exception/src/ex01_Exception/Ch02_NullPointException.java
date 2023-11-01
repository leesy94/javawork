package ex01_Exception;

public class Ch02_NullPointException {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());
		}catch(NullPointerException ne) {
			System.out.println("노데이터");
			System.out.println("에러메세지 : "+ ne);
		}
	}

}
