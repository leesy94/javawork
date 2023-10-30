package in03_polymorphism;

class A {
	int aa = 10;
}
class B extends A {
	int bb = 20;
}
class C extends A {
	int cc = 30;
}
class D extends C {
	int dd = 40 ;
}
class E extends B {
	int ee = 50 ;
}

public class Ch01_polymorphism_MainTest {

	public static void main(String[] args) {
		B b1 = new B();
		A a1 = b1 ; // A클래스로 형변환 : A클래서의 인스턴스 멤버만 사용가능
		C c1 = new C();
		
		a1 = c1;
		
		E e1 = new E();
		A a3 = e1;
	}

}
