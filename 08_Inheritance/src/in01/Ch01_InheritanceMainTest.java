package in01;

class A {
	int aa = 1;
}
class B extends A {
	int bb = 2;
}
class C extends B {
	int cc = 3;
}
////////////////////////////////////
class AA {
	int i;
	int j;
	
	void setIJ(int x, int y) {
		i = x;
		j = y;
	}; 
}

class BB extends AA {
	int total;
	void sum() {
		total = i + j ;
	}
}
///////////////////////////////////
class D {
	int x;
	static int sx;
}
class E extends D {
	String x;
	static String sx;
}



public class Ch01_InheritanceMainTest {

	public static void main(String[] args) { //상속자만 부모것들 사용가능
		C objC = new C();
		System.out.println("aa 속성 값 : " + objC.aa);
		System.out.println("bb 속성 값 : " + objC.bb);
		
		/////////////////////////////////////////////////////
		BB objB = new BB() ;
		
		objB.setIJ(10,20);
		objB.sum();
		System.out.println(objB.total);
		
		/////////////////////////////////////////////////////
		E e = new E();
		e.x = "진흙 속 다이아몬드" ;
		E.sx = "진흙 속 다이아몬드" ;
		D.sx = 500;
		
		
		System.out.println(E.sx + D.sx);
		//e.x = 500 ; 지역변수 > 개체생성된 곳> 부모> 전역변수
	}

}
