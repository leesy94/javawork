package in01;

class over {
	void show() {
		System.out.println("냥냥뇽뇽 부모클래스 show 메소드 호출");
	}
	void play(String aa) {
		System.out.println("부모 : "+aa);
	}
}
class riding extends over {
	//오바라이딩
	void show() {
		System.out.println("자식클래스 show 메소드 호출 냥냥뇽뇽");
	}
	//오버로딩 : 매개변수의 갯수가 다르거나 자료형이 달라야됨
	void play(int aa) {
		System.out.println("자식 : "+aa);
	}
}

public class Ch02_Overriding_MainTest {

	public static void main(String[] args) {
		riding over = new riding();
		over.show();
		over.play("자소서 으ㅏㅏㅏㅏ");;
	}

}
