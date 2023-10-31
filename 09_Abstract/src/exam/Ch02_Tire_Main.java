package exam;

public class Ch02_Tire_Main {

	public static void main(String[] args) {
		Ch02_Car Car = new Ch02_Car();
		
		Car.run();
		
		Car.frontLeftTire = new Ch02_koreaTire();
		
		Car.run();
	}

}
