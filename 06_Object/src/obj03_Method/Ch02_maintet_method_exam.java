package obj03_Method;

public class Ch02_maintet_method_exam {

	public static void main(String[] args) {
		Ch02method_exam me = new Ch02method_exam();
		
		System.out.println(me.add(15, 5));
		System.out.println(me.minus(15, 5));
		System.out.println(me.multiplication(15, 5));
		System.out.println(me.divide(15, 5));
		System.out.println(me.remain(15, 5));
		
		me.calculateWithOperator('X', 5,5,30);
		
		
	}

}
