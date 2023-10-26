package obj04_Const;

public class Ch03_maintest_overloading {

	public static void main(String[] args) {
		
		Ch03_overloading car = new Ch03_overloading("기아","k9","yellow",300);
		System.out.println(car.com);
		System.out.println(car.model);
		System.out.println(car.color);
		System.out.println(car.speed);
		
		Ch03_overloading car2 = new Ch03_overloading("헌대","아반떼","green",500);
		System.out.println(car2.com);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.speed);
		System.out.printf("%5s\n %5s\n %5s\n %5d\n",car2.com,car2.model,car2.color,car2.speed);
		
		Ch03_overloading car3 = new Ch03_overloading();
		System.out.println(car3.com);
		
		Ch03_overloading car4 = new Ch03_overloading("company");
		System.out.println(car4.com);
	}

}
