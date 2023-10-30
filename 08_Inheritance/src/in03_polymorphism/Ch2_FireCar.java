package in03_polymorphism;

public class Ch2_FireCar extends Ch2_Car {
	void water() {
		System.out.println("물을 뿌립니다.");
	}
	Ch2_FireCar() {
		//super(model,color);
	}
	Ch2_FireCar(String model,String color) {
		super(model,color);
	}
}
