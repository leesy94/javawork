package ex01;

public class Ch01_ArithmeticException {

	public static void main(String[] args) {
		try {
			//예외가 발생할 수 있는 경우
			System.out.println(3);
			int result = 30/0; //예외발생
			System.out.println(2222);
		} catch (Exception e) {
			//예외 발생했을 때 실행
			System.out.println(4);
		}
		System.out.println(5);
	
	}

}
