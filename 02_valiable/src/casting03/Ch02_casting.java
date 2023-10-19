package casting03;

public class Ch02_casting {

	public static void main(String[] args) {
		int num1 = 234324; 
		byte byte1 = (byte)num1; // byte에 들어갈 수 있는 범위보다 크기 때문에 변환에서 적용됨
		System.out.println(byte1);
		
		//보통 double형을 int로 바꿔서 소수점 다 버리기
		double d1 = 26.4444;
		num1 = (int)d1;
		System.out.println(num1);
		
	}

}
