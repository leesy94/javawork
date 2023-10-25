package obj01;
// 실행용 클래스

class B {
	int b1 = 10;
}



public class Ch01_maintest { //public은 한 클래스만

	public static void main(String[] args) {
		Ch01_a a1 = new Ch01_a(); // => 객체생성
		Ch01_a a2 = new Ch01_a();
		
		B b = new B();
	}

}
