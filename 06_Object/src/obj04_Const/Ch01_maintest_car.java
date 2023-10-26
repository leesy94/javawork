package obj04_Const;

public class Ch01_maintest_car {

	public static void main(String[] args) {
		
		Ch01_car car = new Ch01_car("기아","k9","yellow",300);
		System.out.println(car.getCom());
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.speed);
		
		Ch01_car car2 = new Ch01_car("헌대","아반떼","green",500);
		System.out.println(car2.getCom());
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.speed);
		System.out.printf("%5s\n %5s\n %5s\n %5d",car2.getCom(),car2.model,car2.color,car2.speed);
	}

}
