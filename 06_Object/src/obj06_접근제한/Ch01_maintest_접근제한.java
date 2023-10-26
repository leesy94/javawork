package obj06_접근제한;

import string01.Ch01_car;

//import obj02_filed.Ch01_car; // 같은 패키지는 가능

public class Ch01_maintest_접근제한 {

	public static void main(String[] args) {
		Ch01_접근제한 b1 = new Ch01_접근제한();
		
		//b1.balance = 10000000;
		
		b1.deposit(5000000);
		int balance = b1.getBalance();
		//int balance = b1.getBalance();
		System.out.println("현재 잔액액 : " + balance);
		
		b1.withdraw(500000);
		balance = b1.getBalance();
		System.out.println("현재 잔액액 : " + balance);
		
		//Ch01_car car = new Ch01_car();
		/*Ch01_car car = new Ch01_car(); //다른 클래스 것 들고와서 쓰기
		String com = car.com ;
		System.out.println(com);*/
		
		Ch01_car car = new Ch01_car() ;
	}

}
