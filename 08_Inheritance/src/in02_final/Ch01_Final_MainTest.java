package in02_final;

//클래스에 final을 붙이면 상속 X 
final class Final01 {
	
}
class Final02 {
	int num = 10;
	final int FNUM = 2; //상수 : 보통 다 대문자로 => 변경불가
	
	//오버라이딩 불가
	final int play() {
		return FNUM;
	}
}
class FinalInfer extends Final02 {
	int show() {
		return 5;
	}
}

public class Ch01_Final_MainTest {

	public static void main(String[] args) {
		FinalInfer fi = new FinalInfer();
		System.out.println(fi.show());
	}

}
