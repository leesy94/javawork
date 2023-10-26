package obj03_Method;

public class Ch05_maintet_method_overloading {

	public static void main(String[] args) {
		Ch05_method_overloading me = new Ch05_method_overloading();
		
		System.out.println(me.add(15, 5));
		System.out.println(me.minus(15, 5));
		System.out.println(me.multiplication(15, 5));
		System.out.println(me.divide(15, 5));
		System.out.println(me.remain(15, 5));
		
		me.calculateWithOperator('X', 5,5,30);
		
		me.add(15);
		me.add(15.5,10.99);
		System.out.println(me.minus(55.5,10.99,5));
	}

}
