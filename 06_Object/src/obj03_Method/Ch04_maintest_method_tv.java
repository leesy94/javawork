package obj03_Method;

import java.util.Scanner;

public class Ch04_maintest_method_tv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		Ch04_method_tv tv = new Ch04_method_tv();
		System.out.println("회사 : " + tv.com);
		System.out.println("모델명 : " + tv.model);
		System.out.println("인치 : " + tv.inch + "inch");
		
		tv.tvturn();
		tv.tvturn();
		tv.tvturn();

		System.out.println(tv.chup());
		System.out.println(tv.chup());
		System.out.println(tv.chdown());
		System.out.println(tv.chdown());
		System.out.println(tv.chdown());
		
		System.out.print("볼륨 : ");
		int val = scan.nextInt();
		System.out.println("볼륨 : "+tv.valum(val));
	}

}
