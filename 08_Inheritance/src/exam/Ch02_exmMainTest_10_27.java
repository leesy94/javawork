package exam;

import java.util.Scanner;

//import com.addinedu.model.vo.Ch01_book;

class phone {
	int aa = 1;
}

public class Ch02_exmMainTest_10_27 {

	public static void main(String[] args) {
		//////////////////////1번
		Ch02_exm_10_27 exam = new Ch02_exm_10_27();
		
		exam.plus();
		System.out.println(exam.MaxNum(5, 9));
		exam.divide();
		System.out.println(exam.EvenSum(15, 5));
		
		Scanner scan = new Scanner(System.in);
		System.out.print("연산자 : ");
		String oper = scan.next();
		System.out.print("숫자 1 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = scan.nextInt();
		System.out.print("숫자 3 : ");
		int num3 = scan.nextInt();
		
		/*Ch02_exm_10_27[] num = new Ch02_exm_10_27[3];
		
		number : for(int i = 0 ; i < num.length;i++) {
			System.out.print("숫자 "+ i +" : ");
			int number[i] = scan.nextInt();
		}*/
		
		
		exam.scan(oper, num1,num2,num3);
		
		
		
	}

}
