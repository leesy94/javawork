package ex01_Exception;

public class Ch07_Finally {

	public static void main(String[] args) {
		try {
			System.out.println("뇨롱");
			return;
		}catch(Exception e) {
			System.out.println("예외발생");
		}finally {
			System.out.println("무조건 무조건이야");
		}
		System.out.println("return있으면 실행X");
	}

}
