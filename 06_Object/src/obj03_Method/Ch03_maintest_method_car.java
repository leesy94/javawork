package obj03_Method;

public class Ch03_maintest_method_car {

	public static void main(String[] args) {
		Ch03_method_car car = new Ch03_method_car();
		
		System.out.println("회사 : " + car.com);
		System.out.println("모델명 : " + car.model);
		System.out.println("색깔 : " + car.color);
		System.out.println("최고속도 : " + car.MAX_SPEED);
		
		// car.run => 변수 
		// car.run(); => 메소드
		
		car.run();
		car.run();
		car.run();
		
		System.out.println("현재속도 : "+car.speedUp());
		System.out.println("현재속도 : "+car.speedUp());
		
		System.out.println("현재속도 : "+car.speed(150));
		
		System.out.println("------------- car2 --------------");
		Ch03_method_car car2 = new Ch03_method_car();
		
		car2.com = "벤츠";
		car2.model = "벤츠??";
		car2.color = "그레이색이야";
		//car2.speed = 150;
		
		car2.run();
		
		System.out.println("\ncar2 회사 : " + car2.com);
		System.out.println("car2 모델명 : " + car2.model);
		System.out.println("car2 색깔 : " + car2.color);
		System.out.println("car2 최고속도 : " + car2.MAX_SPEED);
		
		car2.speed = 150 ;
		
		System.out.println("현재속도 : "+car2.speedUp());
		System.out.println("현재속도 : "+car2.speedUp());
		System.out.println("현재속도 : "+car2.speedUp());
		System.out.println("현재속도 : "+car2.speedDown());
		System.out.println("현재속도 : "+car2.speedDown());
		System.out.println("현재속도 : "+car2.speedUp());
		System.out.println("현재속도 : "+car2.speedUp());
		System.out.println("현재속도 : "+car2.speedDown());
		System.out.println("현재속도 : "+car2.speedDown());
		
		
		System.out.println("현재속도 : "+car2.speed(200)+"\n");
		
		car2.run();
		
		
	} 

}
