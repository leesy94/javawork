package obj03_Method;

public class Ch01_maintest_Method {

	public static void main(String[] args) {
		Ch01_Method m1 = new Ch01_Method();
		m1.print1(); // 메소드 호출 => 반환형이 없어서 print 안됨 , 저장도 안됨
		//m1.print2(); // 메소드 호출
		
		int re = m1.print2();
		System.out.println(m1.print2());
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(10);
		
		System.out.println(m1.print6(10));
		
		System.out.println(m1.print7(10));
		
		System.out.println(m1.print8(4,66));
		
		m1.print9("매개변수",66);

	}

}
