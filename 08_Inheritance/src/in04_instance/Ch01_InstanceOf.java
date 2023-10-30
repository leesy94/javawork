package in04_instance;

class parent {
	
}
class Child extends parent {
	
}

public class Ch01_InstanceOf {

	public static void main(String[] args) {
		/*
		 * instanceof
		 * 좌측의 객체가 우측의 타입으로 만들어졌냐를 검사
		 * -true : 우측타입으로 객체가 만들어 졌다(강제형변환 가능)
		 * -false : 우측타입으로 객체가 만들어지지 않았다(강제형변환 불가)
		 */
		parent p1 = new parent();
		if(p1 instanceof Child) {
			Child c1 = (Child)p1;
			System.out.println("p1을 자식클래스 강제형변환 성공");
		}else {
			System.out.println("p1은 강제형변환 불가");
		}
		
		parent p2 = new Child();
		if(p2 instanceof Child) {
			Child c2 = (Child)p2;
			System.out.println("p2를 자식클래스 강제형변환 성공");
		}else {
			System.out.println("p2는 강제형변환 불가");
		}
	}

}
