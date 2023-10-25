package obj02_filed;

public class Ch01_maintest_filed {

	public static void main(String[] args) {
		Ch01_car car1 = new Ch01_car();
		String company = car1.com;
		System.out.println(company);
		
		System.out.println(car1.model);
		
		car1.model = "k5";
		
		System.out.println(car1.model);
		
		//car1.MAX_SPEED = 800 ; => 상수라서 안됨
		car1.maxSpeed = 800 ;
		
		
		System.out.println("------------------------------------"); 
		
		Ch01_car car2 = new Ch01_car();
		
		System.out.println(car2.model);
		
		
		
		
	}

}
