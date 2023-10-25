package obj03_Method;

public class Ch03_method_car {
	String com = "현대";
	String model = "그랜저";
	String color = "레드";
	final int MAX_SPEED = 350;
	int speed ;
	boolean run ;
	
	void run() {
		
		if(!run) {
			System.out.println("gogo!!");
		}
		else {
			System.out.println("stop!");
		}
		run = !run;
		
		//run = true;
	}
	
	int speedUp() {
		++speed;
		return speed;
	}
	int speedDown() {
		--speed;
		return speed;
	}
	int speed(int sp) {
		this.speed = sp ;
		return this.speed; 
	}
	
}
