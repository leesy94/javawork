package var01;

public class Ch06_etc {

	public static void main(String[] args) {
		//long = 정수, float = 실수

		long long1 = 1111111111234567891L; // "L"을 안붙이면 int로 받아들임
		float float1 = 1.23445f; // "f"를 붙여야됨, double형을 float으로 생각함
		
		//자료형의 범위를 미리 만들어놓은 클래스 사용
		System.out.println("byte 크키 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short 크기 : "+ Short.MIN_VALUE +" ~ "+ Short.MAX_VALUE);
		System.out.println("int 크기 : "+ Integer.MIN_VALUE +" ~ "+ Integer.MAX_VALUE);
		System.out.println("char 크기 : "+ (int)Character.MIN_VALUE +" ~ "+ (int)Character.MAX_VALUE);
	}

}
