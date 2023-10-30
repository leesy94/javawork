package in03_polymorphism;

public class Ch2_Car {
	boolean power;
	String model;
	String color;
	final int MAX_SPEED = 300;
	int speed;
	
	Ch2_Car() {
		this("1234","red"); //기본값
	}
	Ch2_Car(String model,String color) {
		this.color = color;
		this.model = model;
	}
	void getPower() {
		power = !power;
		if(power) {
			System.out.println("power on");
		}else {
			System.out.println("power off");
		}
	}
	
	void speedUp() {
		speed += 10;
		System.out.println("speed : "+speed);
	}
	void speedDown() {
		if(speed >= 10) {
			speed -= 10;
		}else {
			speed = 0 ;
		}
		System.out.println("speed : "+speed);
	}
	String info() {
		return "모델 :" + model+" / 컬러 : "+color+" / max speed : "+MAX_SPEED+" / speed : "+speed;
	}
}
