package ex01_Exception;

public class Ch03_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		String str[] = {"a","b"};
		try {
			str[4] = "d";
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("배열의 범위를 넘었습니다.");
			System.out.println(a);
			
		}
	}

}
